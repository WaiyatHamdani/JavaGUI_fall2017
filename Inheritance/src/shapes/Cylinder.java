/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author 00220682
 */
public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return getPerimeter() * height + (2 * super.getArea());
    }
    
    public double getVolume(){
        return super.getArea() * height;
    }
}
