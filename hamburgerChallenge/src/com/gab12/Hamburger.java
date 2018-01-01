package com.gab12;

/**
 * Created by SONY on 12/8/2017.
 */
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String bradRollType;

    private String additionName;
    private double additionalPrice;

    private String addition2Name;
    private double additional2Price;

    private String addition3Name;
    private double additional3Price;

    private String addition4Name;
    private double additional4Price;

    public Hamburger(String name, String meat, double price, String bradRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bradRollType = bradRollType;
    }

    public void addHamburgerAddition(String name, double price){
        this.additionName=name;
        this.additionalPrice=price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.additional2Price=price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.additional3Price=price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.additional4Price=price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.bradRollType + " roll "
            + "price is " + this.price);
        if(this.additionName != null){
            hamburgerPrice += this.additionalPrice;
            System.out.println(this.additionName + " added with" + this.meat + ", for an extra " + this.additionalPrice );
        }

        if(this.addition2Name != null){
            hamburgerPrice += this.additional2Price;
            System.out.println(this.addition2Name + " added with" + this.meat + ", for an extra " + this.additional2Price );
        }

        if(this.addition3Name != null){
            hamburgerPrice += this.additional3Price;
            System.out.println(this.addition3Name + " added with" + this.meat + ", for an extra " + this.additional3Price );
        }

        if(this.addition4Name != null){
            hamburgerPrice += this.additional4Price;
            System.out.println(this.addition4Name + " added with" + this.meat + ", for an extra " + this.additional4Price );
        }

        return hamburgerPrice;
    }
}
