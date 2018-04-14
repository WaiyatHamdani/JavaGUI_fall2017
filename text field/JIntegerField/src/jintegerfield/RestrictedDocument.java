/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jintegerfield;

import javax.swing.text.*;

/**
 *
 * @author 00220682
 */
public class RestrictedDocument extends PlainDocument{
    String[] charList;
    
    public RestrictedDocument(String[] charList){
        this.charList = charList;
    }

    public RestrictedDocument() {
        
    }
    
    
    public boolean validate(String exp){
        for(int i=0; i<charList.length; i++){
            if(exp.equals(charList[i])){
                return true;
            }
        }
        return false;
    }
    
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
            String jTextField = getText(0, getLength()); // geting JTextField value enter by user
            StringBuilder b = new StringBuilder(jTextField); // create String buffer object
            b.insert(offs, str); //
            jTextField = b.toString();
            boolean proceed = true; // default value for checking
            try {
                if (!jTextField.isEmpty()) { // check jTextField is not empty if Yes then
                    int val = Integer.valueOf(jTextField); // parset into integer
                    proceed = val >= 0 && val <= 255; // return true or false value if input vlaue between 0-255
                }
            } catch (NumberFormatException e) {  // to handle number exception       
                proceed = false;
            }
            if (proceed) {
                super.insertString(offs, str, a);
            }
    }
}
