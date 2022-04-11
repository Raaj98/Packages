package com.collectionExample;
import java.util.*;
import java.util.Iterator;
public class School {
    public static void main(String[] args) {
        Student s1 = new Student("raaj",1,40);
        Student s2 = new Student("shenba",2,23);
        Student s4 = new Student("thivakar",4,50);
        Student s3 = new Student("sathish",3,30);

        List<Student>studentList=new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.println(studentList.get(0).getName());
        System.out.println();
        Iterator itr = studentList.iterator();
        while (itr.hasNext()){
            Student st = (Student) itr .next();
            System.out.println(st.getName() + st.getId() + st.getAge());}
            int m =studentList.get(0).age;
        for (int i =0;i<studentList.size();i++) {
            if (m < studentList.get(i).age) {
                m = studentList.get(i).getAge();
            }
        }
            System.out.println(m);
    }
}
