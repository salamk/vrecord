/*
 * Main.java
 *
 * Created on January 28, 2008, 1:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package voterrecord;

/**
 *
 * @author salamsm
 */
public class Main {
  
    /** Creates a new instance of Main */
    public Main(){
    }
    
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Splash splash = new Splash();
        splash.setVisible(true);
        splash.executeMessages();
        LoginDialog ld = new LoginDialog();
        ld.setVisible(true);
       
    }
    
}
