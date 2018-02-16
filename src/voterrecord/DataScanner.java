/*
 * DataScanner.java
 *
 * Created on February 1, 2008, 6:16 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package voterrecord;
import java.util.*;
/**
 *
 * @author salamsm
 */
public class DataScanner {
    
    /** Creates a new instance of DataScanner */
    public DataScanner(){
    }
    
    public String[] getToken (String line)
    {
        String[] token = line.split(",");
        return token;
        
    }
    
    public boolean checkEmpty(String sr){
        boolean empty = false;
        if(sr.isEmpty())
            empty = true;
        return empty;
    }
    
    
    public int familyNoLength(String familyNo){
        return familyNo.length();
    }
    
    
    
    
    
    
    
    
}
