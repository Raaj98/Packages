package com.collectionExample;
import java.util.*;
public class Office {
    public static void main(String[] args) {
        Employee e1 = new Employee("raaj", 101, 10000);
        Employee e2 = new Employee("shenba", 102, 12000);
        Employee e3 = new Employee("sathis", 103, 15000);

        HashMap<Integer, Employee> ae = new HashMap<Integer, Employee>();
        ae.put(0, e1);
        ae.put(1, e2);
        ae.put(2, e3);
          System.out.println(ae.get(0).getName());
        Iterator<Integer> aeKey = ae.keySet().iterator();
        while (aeKey.hasNext()){
            Integer key = aeKey.next();
         //   System.out.println(key);
            if (ae.get(key).getName().charAt(0)=='s'){
                System.out.println(key);
            System.out.println(ae.get(key).getName());
            }
        }
    }
}
