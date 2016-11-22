package thread.concurrent;

import java.util.Arrays;
import java.util.concurrent.locks.*;

public class ArrayList3<E> {

//     使用 StampedLock
    private StampedLock lock = new StampedLock();
    private Object[] elems;
    private int next;

    public ArrayList3(int capacity) {
        elems = new Object[capacity];
    }

    public ArrayList3() {
        this(16);
    }

    public void add(E elem) {
        
//        取得写入锁定
        long stamp = lock.writeLock();
        try {
            if (next == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[next++] = elem;
        } finally {
            
//            解除写入锁定
            lock.unlockWrite(stamp);
        }
    }

    public E get(int index) {

//        试着乐观读取锁定
        long stamp = lock.tryOptimisticRead();
        Object elem = elems[index];
        
//        查询是否有排他锁定
        if (!lock.validate(stamp)) {
            
//            真正地读取锁定
            stamp = lock.readLock();
            try {
                elem = elems[index];
            } finally {
                
//                解除读取锁定
                lock.unlockRead(stamp);
            }
        }
        return (E) elem;
    }

    public int size() {

        long stamp = lock.tryOptimisticRead();
        int size = next;
        if (!lock.validate(stamp)) {
            stamp = lock.readLock();
            try {
                size = next;
            } finally {
                lock.unlockRead(stamp);
            }
        }
        return size;
    }
}
