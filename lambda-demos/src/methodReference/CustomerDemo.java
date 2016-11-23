package methodReference;

import static java.lang.System.out;
import java.util.*;
import static java.util.Comparator.comparing;

public class CustomerDemo {
    
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Justin", "Lin", 323),
                new Customer("Aonica", "Hua", 323),
                new Customer("Drena", "Da", 329)
        );
        
        Comparator<Customer> byLastName = comparing(Customer::getLastName);
        
        customers.sort(byLastName
                .thenComparing(Customer::getFirstName)
                .thenComparing(Customer::getZipCode));
        
        customers.forEach(out::println);
    }
}

class Customer {
    
    private String firstName;
    private String lastName;
    private Integer zipCode;
    
    public Customer(String firstName, String lastName, Integer zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }
    
    public String toString() {
        return String.format("Customer  (%s , %s , %d)", firstName, lastName, zipCode);
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public Integer getZipCode() {
        return zipCode;
    }
}

/*
run:
Customer  (Drena , Da , 329)
Customer  (Aonica , Hua , 323)
Customer  (Justin , Lin , 323)

先按 lastName 排序，再按 firstName，而后按 zipCode
 */
