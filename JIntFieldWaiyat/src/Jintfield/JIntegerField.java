/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jintfield;
import javax.swing.JTextField;
import javax.swing.text.Document;
/**
 *
 * @author Waiyat Hamdani
 */
public class JIntegerField extends JTextField{
    public JIntegerField(){
        super();
    }
    protected Document createDefaultModel(){
        String[] accept = {"0","1","2","3","4","5","6","7","8","9"};
        return new RestrictedDocument(accept);
    }
}

