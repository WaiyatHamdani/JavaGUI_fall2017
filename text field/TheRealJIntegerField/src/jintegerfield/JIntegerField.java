/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jintegerfield;

/**
 *
 * @author 00220682
 */
public class JIntegerField extends JRegExpField{
    public JIntegerField(){
        super();
        setExp("[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]");
    }
    
    public int getValue() throws NumberFormatException{
        return Integer.parseInt(getText());
    }
}
