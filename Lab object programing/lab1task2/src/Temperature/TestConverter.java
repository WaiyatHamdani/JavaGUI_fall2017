/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;

import javax.swing.JOptionPane;
public class TestConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] choices={"Farenheit to Celcius","Celcius to Farenheit"};
       String input = (String) JOptionPane.showInputDialog(null,"Choose Temp Converter","Temperature Converter", 
                            JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
       //http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm
       
       while(input!=null){
           switch(input){
               case"Farenheit to Celcius":
                   double degreef = Double.parseDouble(JOptionPane.showInputDialog("Enter degree in Farenheit:"));
                   FtoC ftoc = new FtoC(degreef);
                   JOptionPane.showMessageDialog(null,"degree farenheit: "+ftoc.getDegreeF()+" is "+ftoc.convertF()+" Celcius");
               break;
               
               case"Celcius to Farenheit":
                    double degreec = Double.parseDouble(JOptionPane.showInputDialog("Enter degree in Celcius:"));
                    CtoF ctof= new CtoF(degreec);
                    JOptionPane.showMessageDialog(null,"degree celcius: "+ctof.getDegreeC()+" is "+ctof.convertC()+ " Farenheit");
               break;
               
               default:
                   
               break;
           }
           JOptionPane.showMessageDialog(null,"program end.Thank you very much","end program message", JOptionPane.INFORMATION_MESSAGE);          
       }
    }
    
}
