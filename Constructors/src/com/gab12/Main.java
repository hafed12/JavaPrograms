package com.gab12;

public class Main {

    public static void main(String[] args) {
/*

        VipCustomer hafed1 = new VipCustomer();
        VipCustomer hafed2 = new VipCustomer("hafed","hafed@gab12.se");

        System.out.println("1st customer is : "+ hafed1.getName() + " his email is : " + hafed1.getEmailAddress() +" his credit limit is : "+ hafed1.getCreditLimit());
        System.out.println("2nd customer is : "+ hafed2.getName() + " his email is : " + hafed2.getEmailAddress() +" his credit limit is : "+ hafed2.getCreditLimit());
*/

        Account gabAccount= new Account();
    gabAccount.withdrawl(100d);
    gabAccount.deposite(100d);
    gabAccount.withdrawl(100d);


    }
}
