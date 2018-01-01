package com.gab12;

/**
 * Created by SONY on 12/17/2017.
 */
public interface Visitor {

    double visit(Liquor liquorItem);
    double visit(Tobacco tobaccoItem);
    double visit(Necessity necessityItem);

}
