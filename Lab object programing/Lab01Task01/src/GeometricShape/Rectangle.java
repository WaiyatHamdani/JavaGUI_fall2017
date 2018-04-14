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
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width= width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea (){
        return (getLength()*getWidth());
    }
    public double getPerimeter(){
        return (2*(getLength()+getWidth()));
    }
}
