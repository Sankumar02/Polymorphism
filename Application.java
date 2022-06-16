package com.Polymorphism;

public class Application {
    void mobile( String name){
        System.out.println("Mobile name :"+name);
    }
    void mobile( String colour,String model){
        System.out.println(" Colour of the mobile :" +colour);
        System.out.println("Model of the mobile :"+model);
    }
    void mobile(int price,double inch){
        System.out.println("Price of the mobile :" +price);
        System.out.println("Inch of the mobile :" +inch);
    }

    public static void main(String[] args) {
        System.out.println("Amazon Detials");
        Application amazon=new Application();
        amazon.mobile("Appple iphone");
        amazon.mobile("sierra blue","Iphone 11");
        amazon.mobile(76000,7.5);
    }
}