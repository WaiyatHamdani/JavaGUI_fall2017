/******************************************************************************
* Program Author:        Waiyat Hamdani
 * Date Created:         02/01/2017
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/

package GeometricShape;

import javax.swing.JOptionPane;
public class TestTask1 {

    public static void main(String[] args) {
        // TODO code application logic here
       String[] choices={"Circle","Triangle","Rectangle"};
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
                       JOptionPane.showMessageDialog(null,"Circumference:"+circle.getCircumference());
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
                        JOptionPane.showMessageDialog(null,"Area:"+triangle.getAreaT());
                        JOptionPane.showMessageDialog(null," Perimeter"+triangle.getPerimeterT());
                break;
                
                default:
                    
                break;
                 
                               
           }
          JOptionPane.showMessageDialog(null,"program end.Thank you very much","end program message", JOptionPane.INFORMATION_MESSAGE);
           
       }
          
          
        }
    
}
    
    
    
        
        
   
