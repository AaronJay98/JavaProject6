package edu.sjsu.macaldo.aaronjay;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int inWidth, int inHeight) {
        super.setLocation(0, 0);
        super.setSize(inWidth, inHeight);
    }

    public int getPerimeter() {
        return this.height * 2 + this.width * 2;
    }

    public int getArea() {
        return this.height * this.width;
    }
}
