package com.company;

public class Apple implements Priceable {
    private int price;
    public Apple(int price){
        this.price=price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
