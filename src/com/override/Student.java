package com.override;

public class Student extends Member {
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
      public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
