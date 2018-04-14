/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01659956
 */
public class SphereClass {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public SphereClass(double radius) {
        this.radius = radius;
    }
    public double getAreaSphere() {
        return (Math.PI*radius*radius)*4.0;
    }
    public double getVolumeSphere(){
        return (Math.PI*radius*radius)*4/3.0;
    }
}
