/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricShape;
import javax.swing.JOptionPane;
/**
 *
 * @author 01659956
 */
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] choices={"Circle","Triangle","Rectangle","Cylinder","RectangularPrism","TriangularPrism","Sphere"};
       String input = (String) JOptionPane.showInputDialog(null,"Choose Shape","The Gemetric Shape", 
                            JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
     //http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm
     
     while (input!=null){
        switch(input){
            
            case "Circle":
                 double radius= Double.parseDouble(JOptionPane.showInputDialog("enter the radius"));
                       Circle circle = new Circle (radius);
                 JOptionPane.showMessageDialog(null, "Radius:"+circle.getRadius());
                 JOptionPane.showMessageDialog(null,"Area:"+circle.getArea());
                 JOptionPane.showMessageDialog(null,"Circumference:"+circle.getPerimeter());
               break;
               
            case "Rectangle":
                double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length"));
                double width = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the width"));
                        Rectangle rectangle = new Rectangle(length, width);
                JOptionPane.showMessageDialog(null,"area:"+rectangle.getPerimeter());
                break;
        
            case "Triangle":
                double s1 = Double.parseDouble(JOptionPane.showInputDialog("Enter hypotenuse"));
                double s2 =Double.parseDouble(JOptionPane.showInputDialog("Enter base"));
                double s3 =Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
                        Triangle triangle = new Triangle (s1,s2,s3);
                JOptionPane.showMessageDialog(null,"Area:"+triangle.getArea());
                JOptionPane.showMessageDialog(null," Perimeter"+triangle.getPerimeter());
                break;
                
            case "Cylinder":
                double Radius= Double.parseDouble(JOptionPane.showInputDialog("enter the radius"));
                double Height= Double.parseDouble(JOptionPane.showInputDialog("enter the height"));
                     Cylinder cylinder=new Cylinder(Radius,Height); 
                JOptionPane.showMessageDialog(null,"Area of Cylinder"+cylinder.getArea());
                JOptionPane.showMessageDialog(null,"volume of cylinder"+cylinder.getVolume());
                break;
                
            case "RectangularPrism":
                double Length=Double.parseDouble(JOptionPane.showInputDialog("Enter the length of prism"));
                double Width=Double.parseDouble(JOptionPane.showInputDialog("enter the width"));
                double height= Double.parseDouble(JOptionPane.showInputDialog("enter height"));
                    RectangularPrism rectangularprism=new RectangularPrism(Length,Width,height);
                JOptionPane.showMessageDialog(null,"Area of Rectangular Prism"+rectangularprism.getArea());
                JOptionPane.showMessageDialog(null,"volume of Rectangular Prism"+rectangularprism.getVolume());
                break;
            
            case "TriangularPrism":
                double S1=Double.parseDouble(JOptionPane.showInputDialog("Enter the side one"));
                double S2=Double.parseDouble(JOptionPane.showInputDialog("Enter the side two"));
                double S3=Double.parseDouble(JOptionPane.showInputDialog("Enter the side three"));
                double TriangularPrismHeight= Double.parseDouble(JOptionPane.showInputDialog("Enter the Height"));
                       TriangularPrism triangularprism=new TriangularPrism(S1,S2,S3,TriangularPrismHeight);
                JOptionPane.showMessageDialog(null,"Area of Triangular Prism"+triangularprism.getArea());
                JOptionPane.showMessageDialog(null,"Volume of Triangular Prism"+triangularprism.GetVolume());
                break;
            
                
            case "Sphere":
                double SphereRadius=Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
                            Sphere sphere=new Sphere(SphereRadius);
                JOptionPane.showMessageDialog(null,"surface of the sphere"+sphere.getSurface());
                JOptionPane.showMessageDialog(null,"volume of the sphere"+sphere.getVolume());
                break;
                  }
        
        
            input = (String)JOptionPane.showInputDialog(null, "Choose shape or click 'Cancel'",
        "Choose the shape, please", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);         
        
    }
    JOptionPane.showMessageDialog(null,"Program ends", "End Program message", JOptionPane.INFORMATION_MESSAGE);
    
    
    }
     public static void showInfo(Shape shape){
     

        JOptionPane.showMessageDialog (null, "Area" + shape.getArea());
        JOptionPane.showMessageDialog (null,"Perimeter" + shape.getPerimeter());
        
       
        if(shape instanceof RectangularPrism)  {
           
            JOptionPane.showMessageDialog(null, "Volume of Rectangular Prism" + ((RectangularPrism) shape).getVolume());
            JOptionPane.showMessageDialog(null, "Lateral of cylinder" + ((RectangularPrism) shape).getLateralArea());
         }
       
       else if (shape instanceof TriangularPrism){
            JOptionPane.showMessageDialog(null, "Volume of triangular Prism" + ((TriangularPrism) shape).GetVolume());
            JOptionPane.showMessageDialog(null, "Lateral of cylinder" + ((TriangularPrism) shape).getLateralArea());
       }
       else if (shape instanceof Cylinder){
            JOptionPane.showMessageDialog(null, "Volume of cylinder" + ((Cylinder) shape).getVolume());
            JOptionPane.showMessageDialog(null, "Lateral of cylinder" + ((Cylinder) shape).getLateralArea());
       } 
       else if (shape instanceof Sphere) {
            JOptionPane.showMessageDialog(null, "Volume of Sphere" + ((Sphere) shape).getVolume());
        }
    
    }
}
    
    

    
    
