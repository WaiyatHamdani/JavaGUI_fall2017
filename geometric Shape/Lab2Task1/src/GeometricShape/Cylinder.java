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
public class Cylinder extends Circle {
    private double Cylinderheight;
    private double CylinderRadius;

    public double getHeight() {
        return Cylinderheight;
    }

    public void setHeight(double height) {
        this.Cylinderheight = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.Cylinderheight = height;
        this.radius=CylinderRadius;
    }
    @Override
    public double getArea(){
        return getPerimeter()*Cylinderheight;
    }
    public double getVolume(){
        return super.getArea()*Cylinderheight;
    }
    public double getLateralArea(){
        return super.getPerimeter() * Cylinderheight;
    }
}
    

