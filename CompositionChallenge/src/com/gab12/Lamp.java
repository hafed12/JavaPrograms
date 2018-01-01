package com.gab12;

/**
 * Created by SONY on 10/25/2017.
 */
public class Lamp {
    private String lampType;
    private boolean state;

    public Lamp(String lampType) {
        this.lampType = lampType;
    }

    public String getLampType() {
        return lampType;
    }

    public boolean turnLightsOn(){
        System.out.println("Lights are on...");
        return state=true;
    }

}
