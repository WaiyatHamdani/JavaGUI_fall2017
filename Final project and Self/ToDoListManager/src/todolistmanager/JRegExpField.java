/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolistmanager;
import javax.swing.*;
import javax.swing.text.*;
        
/**
 *
 * @author waiya
 */
public class JRegExpField extends JTextField{
    private String exp;
    
    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
        setDocument(new RegExpDocument(exp));
    }
    
    public JRegExpField(){
        super();
    }
    
    public JRegExpField(String exp){
        this.exp = exp;
        //setDocument(new RegExpDocument(exp));
    }
    
    protected Document createDefaultModel(){
        return new RegExpDocument(exp);
    }
}
    
    
