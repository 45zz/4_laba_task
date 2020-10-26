package com.company;

public class Main {

    public static void main(String[] args) {
        Pencil pencil=new Pencil(10);
        System.out.println("pencil = "+pencil.getPrice());
        Apple apple=new Apple(20);
        System.out.println("apple = "+apple.getPrice());
    }
}
