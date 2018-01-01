package com.gab12;

/**
 * Created by SONY on 10/25/2017.
 */
public class Walls {
    private int southWall;
    private int westWall;
    private int eastWall;
    private int northWall;

    public Walls() {
        this.southWall = 1;
        this.westWall = 1;
        this.eastWall = 1;
        this.northWall = 1;
    }

    public Walls(int southWall, int westWall, int eastWall, int northWall) {
        this.southWall = southWall;
        this.westWall = westWall;
        this.eastWall = eastWall;
        this.northWall = northWall;
    }

    public int getSouthWall() {
        return southWall;
    }

    public int getWestWall() {
        return westWall;
    }

    public int getEastWall() {
        return eastWall;
    }

    public int getNorthWall() {
        return northWall;
    }
}
