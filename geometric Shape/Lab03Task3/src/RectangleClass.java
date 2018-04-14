/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01659956
 */
public class RectangleClass {
    private double width,length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public RectangleClass(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getAreaRectangle(){
        return width*length;
    }
    public double getPerimeterRectangle(){
        return 2.0*(width*length);
    }
}
