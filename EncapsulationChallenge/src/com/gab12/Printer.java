package com.gab12;

/**
 * Created by SONY on 10/25/2017.
 */
public class Printer {
    private String brand;
    private int tonerLevel=100;
    private int printedPages = 0;
    private boolean duplixPrinting;
    private int availablePages;

    public Printer(String brand, boolean duplixPrinting, int availablePages) {
        this.brand = brand;
        this.duplixPrinting = duplixPrinting;
        this.availablePages = availablePages;
    }

    public void tonerRefill(){
        tonerLevel=100;
        System.out.println("The toner is filled to" + tonerLevel + "%");
    }

    public void printPage(int numberOfpages){
        if(availablePages >=  numberOfpages){
            if(tonerLevel > -1 && tonerLevel <= 100){
                printedPages+= numberOfpages;
                availablePages=-printedPages;
                tonerLevel -= numberOfpages;
                System.out.println("Printing process started");
                System.out.println(numberOfpages + " printed.");
                System.out.println("Toner level is: " + tonerLevel +"%");
            }else {
                System.out.println("Toner is empty, refill please.");
            }
        } else if(availablePages >=  (numberOfpages/2)) {
            duplixPrinting = true;
            System.out.println("Duplix printing mode is on...");
        }else{
            System.out.println("Number of available pages is not enough");
        }
    }


    private int getAvailablePages() {
        return availablePages;
    }



    private void setDuplixPrinting(boolean duplixPrinting) {
        this.duplixPrinting = duplixPrinting;
        if(duplixPrinting == true){
            System.out.println("Duplix printing mode is on...");
        } else{
            System.out.println("Duplix printing mode is off");
        }
    }

}
