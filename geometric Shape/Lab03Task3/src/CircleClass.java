/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01659956
 */
public class CircleClass {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public CircleClass(double radius) {
        this.radius = radius;
    }
    public double getAreaCircle(){
        return Math.PI*radius*radius;
    }
    public double GetCircumference(){
        return Math.PI*radius*2;
    }
}
