/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.text.Document;
import regexpfield.JIntegerField;

/**
 *
 * @author tduffy
 */
public class JColorComponentTextField extends JIntegerField{
    
    private String exp;

    @Override
    public void setExp(String exp) {
        setDocument(new ColorComponentDocument(exp));
    }
    
    public JColorComponentTextField(){
        super();
        setText("0");
        setExp("[0-9]*");
    }
    
    @Override
    public int getValue() throws NumberFormatException{
        return Integer.parseInt(getText());
    }
    
    @Override
    protected Document createDefaultModel(){
        return new ColorComponentDocument(exp);
    }
    
    
}
