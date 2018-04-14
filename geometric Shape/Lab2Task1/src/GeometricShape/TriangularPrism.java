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
public class TriangularPrism extends Triangle {
    private double height;
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TriangularPrism(double height, double S1, double S2, double S3) {
        super(S1, S2, S3);
        this.height = height;
    }
    @Override
    public double getArea(){
        return getPerimeter()*height;
}
    public double GetVolume(){
        return super.getArea()*height;
    }
     public double getLateralArea(){
       return getPerimeter()*height;
   }
}