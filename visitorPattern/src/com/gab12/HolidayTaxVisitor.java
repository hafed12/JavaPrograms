package com.gab12;

import java.text.DecimalFormat;

/**
 * Created by SONY on 12/17/2017.
 */
public class HolidayTaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    public HolidayTaxVisitor() {

    }

    @Override
    public double visit(Liquor liquorItem) {
        return Double.parseDouble(df.format((liquorItem.getPrice()*0.30)+ liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        return Double.parseDouble(df.format((tobaccoItem.getPrice()*0.10)+ tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        return Double.parseDouble(df.format((necessityItem.getPrice()*0)+ necessityItem.getPrice()));
    }
}
