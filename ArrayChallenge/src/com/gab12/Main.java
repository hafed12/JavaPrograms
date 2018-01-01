package com.gab12;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	int[] myIntegers = getIntegers(5);
    printArray(myIntegers);
    int[] sorted = sortArray(myIntegers);
    System.out.println("The sorted array values are:\n" );
    printArray(sorted);


    }

    public static int[] getIntegers(int number){
        int[] values= new int[number];
        System.out.println("Enter five values: \n");
        for (int i=0; i<values.length;i++){
            values[i]= scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] myIntegers){
        for (int i = 0; i<myIntegers.length;i++){
            System.out.println("\n Element " + i + " is " + myIntegers[i]);
        }
    }

    public static int[] sortArray(int[] myIntegers){
        int[] values = new int[myIntegers.length];
        int temp = 0;
        for (int i = 0; i< values.length-1; i++){
            if(myIntegers[i]< myIntegers[i+1]) {
                temp = myIntegers[i];
                myIntegers[i]=myIntegers[i+1];
                myIntegers[i+1]=temp;

            }

            values[i]=myIntegers[ i];
        }
        values[values.length-1]=myIntegers[myIntegers.length-1];

        return values;
    }


}
