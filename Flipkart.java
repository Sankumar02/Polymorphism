package com.Polymorphism;

public class Flipkart extends Flipkart1 {
    public void search() {

        System.out.println("displaying the product in flipkart");
    }

    public static void main(String[] args) {
        Flipkart flipkart1 = new Flipkart();
        flipkart1.laptop();
        flipkart1.search();
    }
}

