/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricShape;

/**
 *
 * @author 01659956
 */
public class RectangularPrism extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public RectangularPrism(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }
    @Override
    public double getArea(){
        return getPerimeter()*height;
}
    public double getVolume(){
        return super.getArea()*height;
    }
    public double getLateralArea(){
       return super.getPerimeter()*height;
   }
}