package com.gab12;

/**
 * Created by SONY on 12/17/2017.
 */
class Liquor implements Visitable {

    private double price;

    Liquor(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
