package com.gab12;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bed bed = new Bed(true, "single", 3);
        Lamp lamp= new Lamp("Normal");
        Wardrobe wardrobe= new Wardrobe(8,5,3);
        Ceiling ceiling=new Ceiling(true);
        Walls walls = new Walls();
        Bedroom bedroom = new Bedroom("Adam's", walls , ceiling, bed, lamp,wardrobe );

        bedroom.makeBed();
        wardrobe.getCloths();
        lamp.turnLightsOn();
    }
}
