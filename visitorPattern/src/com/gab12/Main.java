package com.gab12;

public class Main {

    public static void main(String[] args) {

        TaxVisitor taxCalc = new TaxVisitor();
        HolidayTaxVisitor holidayTaxCalc = new HolidayTaxVisitor();

        Necessity milk= new Necessity(3.47);
        Liquor vodka= new Liquor(11.90);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalc)+"\n");
        System.out.println(cigars.accept(taxCalc)+"\n");
        System.out.println(vodka.accept(taxCalc)+"\n");

        System.out.println("Holiday Tax Prices: \n ");

        System.out.println(milk.accept(holidayTaxCalc)+"\n");
        System.out.println(cigars.accept(holidayTaxCalc)+"\n");
        System.out.println(vodka.accept(holidayTaxCalc)+"\n");

    }
}
