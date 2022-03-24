package com.inheritance;
import com.inheritance.Programmer;
public class Run {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("java","raaj",25000,18);
        System.out.println(p1.employeeId);
        System.out.println(p1.project);
    }
}
