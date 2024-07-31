package org.example;

import org.astonbitecode.j4rs.api.Instance;
import org.astonbitecode.j4rs.api.java2rust.Java2RustUtils;


class Output {
    public int x;
    public Output(int x) {
        this.x = x;
    }

    public Output()
    {
    }

    public String toString() {
        // return "x: " + x + ", y: " + y;
        return "x: " + x;
    }

    // public int getNumber() {
    //     return x;
    // }

    // public void setNumber(int number) {
    //     this.x = number;
    // }
}
public class Runner {

    static {
        System.loadLibrary("rust_test");
    }

    public static Point run() {
        Point input = new Point(new int[]{1,2}, 1);
        Instance<Point> instance = fnnoargs(Java2RustUtils.createInstance(input));
        Output s = Java2RustUtils.getObjectCasted(instance);
        System.out.println(s);
        // return s;

        // return new Point(1, 2);
        return input;
    }

    private static native Instance<Point> fnnoargs(Instance<Point> s);
}