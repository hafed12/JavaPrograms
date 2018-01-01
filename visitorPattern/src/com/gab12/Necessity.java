package com.gab12;

/**
 * Created by SONY on 12/17/2017.
 */
public class Necessity  implements Visitable{

        private double price;

        public Necessity(double price) {
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
