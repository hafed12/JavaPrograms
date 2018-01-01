package com.gab12;

/**
 * Created by SONY on 10/25/2017.
 */
public class Wardrobe {
    private float height;
    private float width;
    private float depth;

    public Wardrobe(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }

    public void getCloths() {
        System.out.println("Cloths are ready...");
    }
}
