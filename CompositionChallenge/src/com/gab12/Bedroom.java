package com.gab12;

/**
 * Created by SONY on 10/25/2017.
 */
public class Bedroom {
    private String name;
    private Walls walls;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;

    public Bedroom(String name, Walls walls, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe) {
        this.name = name;
        this.walls = walls;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
    }

    public void makeBed(){
        bed.makeBed();
    }

}
