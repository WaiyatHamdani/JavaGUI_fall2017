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
public class TestShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        showInfo(circle);
        Rectangle rectangle = new Rectangle(2,3);
        showInfo(rectangle);
        Cylinder cylinder = new Cylinder(2,2);
        showInfo(cylinder);
    }
    
    public static void showInfo(Shape shape){
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println(shape.toString());
        if(shape instanceof Cylinder){
            Cylinder cylinder = (Cylinder)shape;
            System.out.println("Volume: " + cylinder.getVolume());
        }
    }
    
}
