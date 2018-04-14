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
public class Triangle extends Shape {
    private double S1,S2,S3;

    public double getS1() {
        return S1;
    }

    public void setS1(double S1) {
        this.S1 = S1;
    }

    public double getS2() {
        return S2;
    }

    public void setS2(double S2) {
        this.S2 = S2;
    }

    public double getS3() {
        return S3;
    }

    public void setS3(double S3) {
        this.S3 = S3;
    }

    public Triangle(double S1, double S2, double S3) {
        this.S1 = S1;
        this.S2 = S2;
        this.S3 = S3;
    }

    @Override
    public double getArea() {
        double S=(S1+S2+S3)/2;
        return Math.sqrt(S*(S-S1)*(S-S2)*(S-S3));
    }

    @Override
    public double getPerimeter() {
       return S1+S2+S3;
    }
    
}
