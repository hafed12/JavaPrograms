package com.gab12;

/**
 * Created by SONY on 9/27/2017.
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;

    public void deposite (double depositeAmount){
        this.balance+= depositeAmount;
        System.out.println("Deposite of " + depositeAmount + " made. New balance" + this.balance);
    }

    public void withdrawl(double withdrawlAmount){
    if (this.balance - withdrawlAmount < 0) {
        System.out.println("Only " + this.balance + " available. Withdrawl not processed");
    }else{
        this.balance-=withdrawlAmount;
        System.out.println("Withdrawl of "+ withdrawlAmount +" processed. Remaining balance = " + this.balance);
    }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    private String customerPhoneNumber;


}
