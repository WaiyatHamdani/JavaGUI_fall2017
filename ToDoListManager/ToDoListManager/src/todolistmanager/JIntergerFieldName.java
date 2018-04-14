/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolistmanager;

/**
 *
 * @author waiya
 */
public class JIntergerFieldName extends JRegExpField {
    public JIntergerFieldName(){
        super();
        setExp("[a-z]*");
    }
    
    public int getValue() throws NumberFormatException{
        return Integer.parseInt(getText());
    }
}
