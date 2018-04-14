/******************************************************************************
* Program Author:        Waiyat Hamdani
 * Date Created:         02/01/2017
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/

package GeometricShape;

/**
 *
 * @author 01659956
 */
public class Circle {
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
     return Math.PI*radius*radius;   
    }
    public double getCircumference(){
        return Math.PI*radius*2;
    }
    
}

