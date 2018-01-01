package com.gab12;

/**
 * Created by SONY on 12/17/2017.
 */
public class Tobacco implements Visitable {


        private double price;

        public Tobacco(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }


    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
