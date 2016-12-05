package com.brainacad.oop.test1;

/**
 * Created by ADMIN on 05.12.2016.
 */
public class Main {
    public static void main(String[] args){
        MyPhoneBook book = new MyPhoneBook();
        book.addPhoneNumber("Shasha" , "0938785790");
        book.printPhoneBook();
    }
}
