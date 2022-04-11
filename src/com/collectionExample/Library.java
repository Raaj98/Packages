package com.collectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book(1,"plata","robert","richDaddy and poorDaddy",100);
        Book b2 = new Book(2,"jaico","robinSharma","when u die who will cry",169);
        Book b3 = new Book(3,"audible","robinSharma","the secret of letters",171);

        HashSet<Book> library = new HashSet<Book>();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        for (Book b:library){
            System.out.println(b.getRackNo()+ " " +b.getPublisher()+ " " +b.getAuthor()+ " " +b.getBookName()+ " " +b.getPrice());
        }
    }
}
