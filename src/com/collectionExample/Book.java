package com.collectionExample;

public class Book {
    private int rackNo;
    private String publisher,author,bookName;
    private int price;

    public Book(int rackNo,String publisher,String author,String bookName,int price){
        this.rackNo=rackNo;
        this.publisher=publisher;
        this.author=author;
        this.bookName=bookName;
        this.price=price;
    }

    public int getRackNo() {
        return rackNo;
    }

    public void setRackNo(int rackNo) {
        this.rackNo = rackNo;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
