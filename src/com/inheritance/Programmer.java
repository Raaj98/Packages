package com.inheritance;

public class Programmer extends Employee{
    public String project;
    public Programmer(String project,String name,double salary,int employeeId){
        this.project=project;
        this.name=name;
        this.salary=salary;
        this.employeeId=employeeId;
    }
}
