package org.example;

import java.util.Arrays;

public class Point {
    public int[] x;
    public int y;
    public Point(int[] x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
    }

    public String toString() {
        return "x: " + Arrays.toString(x) + ", y: " + y;
        // return "x: " + x;
    }

    // public int getX() {
    //     return x;
    // }

    // public void setYY(int number) {
    //     this.x = number;
    // }

    // public int getY() {
    //     return y;
    // }

    // public void setXX(int number) {
    //     this.y = number;
    // }
}