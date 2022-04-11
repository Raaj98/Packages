package com.ShoppingCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        Product p1 = new Product("101","BajajFans",1000);
        Product p2 = new Product("102","cromptonFans",850);
        Product p3 = new Product("103","ac",15000);
        Customer c1 = new Customer("1","raaj","ond",93873664);
        // adding product in arrayLIst
        List<Product>productList = new ArrayList<Product>();
        productList.add(p1);
        productList.add(p2);
        Order o1 = new Order(productList,"10",c1.getCustomerId());
        c1.add_order(o1);  //add the order to the customer

        productList.clear(); //clear the product in the arrayList
        productList.add(p2); // add the product in the arrayList
        productList.add(p3);
        Order o2 =new Order(productList,"11",c1.getCustomerId());
        c1.add_order(o2); // add the to the customer
         // using iterator to add the total amount
        Iterator<Order> itr = c1.getOrderList().iterator();
        int totalAmount = 0;
        while (itr.hasNext()){
            Order o = (Order) itr.next();
            totalAmount += o.getAmount();
        }
        System.out.println("total amount is :" + totalAmount );
    }
}
