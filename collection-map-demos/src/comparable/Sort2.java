package comparable;

import java.util.*;

class Account implements Comparable<Account> {

    private String name;
    private String number;
    private int balance;

    Account(String name, String number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account (%s , %s , %d)", name, number, balance);
    }

    @Override
    public int compareTo(Account other) {
        return this.balance - other.balance;
    }
}

public class Sort2 {

    public static void main(String[] args) {
        List accounts = Arrays.asList(
                new Account("Jociy", "X1234", 1000),
                new Account("Monic", "X3211", 3122),
                new Account("Irene", "X3212", 1121)
        );

        Collections.sort(accounts);
        System.out.println(accounts);
    }
}


// [Account (Jociy , X1234 , 1000), Account (Irene , X3212 , 1121), Account (Monic , X3211 , 3122)]
