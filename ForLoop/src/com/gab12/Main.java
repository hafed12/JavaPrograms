package com.gab12;

public class Main {

    public static void main(String[] args) {
        int x=1,y=1,t=2;

        for( int i=1 ; i<=6 ; i++ ) {

            x=y*x;
            System.out.println(x);
            y=t;
            t=x;
        }
    }
}
