package com.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> productList = new ArrayList<>();
    private int amount;
    private String customerId;
      //constructor
    public Order(List<Product>productList,String orderId, String customerId) {
        this.productList=productList;
        this.orderId = orderId;
        this.amount=this.calcAmount(productList);
        this.customerId = customerId;
    }
    //getter and setter function
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void add_Product(Product p) {
        productList.add(p);
    }
         //add amount
    private Integer calcAmount(List<Product> productList) {
       int  amount = 0;
        for (Product product : productList) {
            amount += product.getProductPrice();
        }
        return amount;
    }
}