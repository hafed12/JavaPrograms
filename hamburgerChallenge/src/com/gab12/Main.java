package com.gab12;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.52,"brown");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition("Cucumber",0.23);
        hamburger.addHamburgerAddition2("cheese",0.84);
        hamburger.addHamburgerAddition3("Tomato",0.22);
        System.out.println("Total Burger price is "+ hamburger.itemizeHamburger());
    }
}
