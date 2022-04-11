package com.ShoppingCart;

public class Product {
    private String productId;
    private String productName;
    private int ProductPrice;
//constructor
    public Product(String id, String name, int price){
        this.productId=id;
        this.productName=name;
        this.ProductPrice=price;
    }
//getter and setter function
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }
}
