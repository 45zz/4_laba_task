package com.company;

public class Pencil implements Priceable{
    private int price;
    public Pencil(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
