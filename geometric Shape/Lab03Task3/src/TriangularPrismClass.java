/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01659956
 */
public class TriangularPrismClass {
    private double s1,s2,s3,height;

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TriangularPrismClass(double s1, double s2, double s3, double height) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.height = height;
    }
    public double getVolumeTriangularPrism(){
       double s=(s1+s2+s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3))*height;
    }
    public double getAreaTriangularPrism(){
        return (s1+s2+s3)*height;
    }
}
