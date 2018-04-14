/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import regexpfield.RegExpDocument;

/**
 *
 * @author tduffy
 */
public class ColorComponentDocument extends RegExpDocument{
    
    public ColorComponentDocument(String exp) {
        super(exp);
    }
    
    @Override
    public boolean validate(String str){
        return super.validate(str) && Integer.parseInt(str)<=255 && Integer.parseInt(str)>=0;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        StringBuilder sb = new StringBuilder(getText(0,getLength()));
        sb.insert(offs,str);
        if(validate(sb.toString())){
            super.insertString(offs, str, a);
        }
    }
}
