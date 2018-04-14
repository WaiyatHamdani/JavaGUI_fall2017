/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01659956
 */
public class RectangularPrismClass {
    private double width,length,height;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public RectangularPrismClass(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public double getVolumeRectangularPrism(){
        return width*length*height;
    }
    public double getAreaRectagularPrism(){
        return 2.0*(length*width)*height;
    }
}
