package com.gab12;

import java.text.DecimalFormat;

/**
 * Created by SONY on 12/17/2017.
 */
public class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor() {

    }

    @Override
    public double visit(Liquor liquorItem) {
        return Double.parseDouble(df.format((liquorItem.getPrice()*0.32)+ liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        return Double.parseDouble(df.format((tobaccoItem.getPrice()*0.18)+ tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        return Double.parseDouble(df.format((necessityItem.getPrice()*0)+ necessityItem.getPrice()));
    }
}
