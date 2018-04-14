/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01659956
 */
public class CylinderClass  {
   private double height,radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public CylinderClass(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
   public double getVolumeCylinder(){
     return Math.PI*radius*radius*height;  
   }
   public double getCircumferenceCylinder(){
       return Math.PI*radius*2*height;
   }
    }
    

