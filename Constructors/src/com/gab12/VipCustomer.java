package com.gab12;

/**
 * Created by SONY on 9/27/2017.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this.name = "name";
        this.creditLimit = 100_000;
        this.emailAddress = "hafed@gab.com";
    }

    public VipCustomer(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = 100_000;
         }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
