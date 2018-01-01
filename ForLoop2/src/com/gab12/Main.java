package com.gab12;

public class Main {

    public static void main(String[] args) {


        int counter=0;
        for(int i=30; i<=60 ; i++){

            if(isPrime(i)){
                counter++;
                System.out.println(i + " is a prime number.");
            }
            if(counter==3){
               // break;
            }

        }

       // for(double i=2.0; i<=8.0 ; i++){
            //System.out.println("The Interest rate of " + i + "is : " + calculateInterest(10000,i));
        //}

    }

    /*public static double calculateInterest(double amount, double rate){

        return (amount*(rate/100));
    }
*/
    public static boolean isPrime(int n){

        if(n==1){
            return false;
        }

        for (int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;

            }
        }
        return true;
    }
}
