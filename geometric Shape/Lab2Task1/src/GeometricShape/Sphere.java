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
public class Sphere extends Circle{

    public Sphere(double radius) {
        super(radius);
    }
    public double getSurface(){
        return super.getArea()*4.0;
    }
    public double getVolume(){
        return super.getArea()*4/3.0;
    }
}
