package com.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private long customerPhNo;
    private List<Order>orderList=new ArrayList<>();
 // constructor
    public Customer(String id,String name,String address,long phNo){
        this.customerId=id;
        this.customerName=name;
        this.customerAddress=address;
        this.customerPhNo=phNo;
    }
 // getter and setter function
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getCustomerPhNo() {
        return customerPhNo;
    }

    public void setCustomerPhNo(long customerPhNo) {
        this.customerPhNo = customerPhNo;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    // input the method
    public void add_order(Order order ){
        orderList.add(order);
    }
}
