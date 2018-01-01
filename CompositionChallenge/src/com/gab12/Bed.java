package com.gab12;

/**
 * Created by SONY on 10/25/2017.
 */
public class Bed {
    private boolean hasBed;
    private String size;
    private int height;


    public Bed( boolean hasBed, String size, int height) {
        this.hasBed = hasBed;
        this.size = size;
        this.height = height;

    }

    public void makeBed(){
        System.out.println("Bed is made...");
    }

    public String getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHasBed() {
        return hasBed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHasBed(boolean hasBed) {
        this.hasBed = hasBed;
    }
}
