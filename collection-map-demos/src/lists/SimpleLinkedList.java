package lists;

public class SimpleLinkedList {

    
    // 将收集的对象用 Node 封装
    
    private class Node {

        private Object elem;

        Node(Object o) {
            this.o = o;
        }
        Object o;
        Node next;
    }

    // 第一个节点
    
    private Node first;

    // 新增 Node 封装对象，并由上一个 Node 的 next 参考
    
    public void add(Object elem) {
        Node node = new Node(elem);
        if (first == null) {
            first = node;
        } else {
            append(node);
        }
    }

    private void append(Node node) {
        Node last = first;
        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
    }

    // 访问所有 Node 并计数以取得长度
    
    public int size() {
        int count = 0;
        Node last = first;
        while (last != null) {
            last = last.next;
            count++;
        }

        return count;
    }

    public Object get(int index) {
        checkSize(index);
        return findElemOf(index);
    }

    private void checkSize(int index) throws IndexOutOfBoundsException {
        int size = size();
        if (index >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Index: %d,size : %d", index, size));
        }
    }

    
    // 访问所有的 Node 并计数以取得对应的索引对象
    
    private Object findElemOf(int index) {
        int count = 0;
        Node last = first;
        while (count < index) {
            last = last.next;
            count++;
        }
        return last.elem;
    }

}
