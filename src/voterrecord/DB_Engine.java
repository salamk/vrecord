/*
 * DB_Engine.java
 *
 * Created on January 31, 2008, 11:25 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package voterrecord;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author salamsm
 */
public class DB_Engine {
    
    /** Creates a new instance of DB_Engine */
    public DB_Engine(){
    }
    
    
    public String[] fetchRecord(String nic){
        
        String[] record = new String[12];
        
        String str_sr = "";
        String str_familyNo = "";
        String str_name = "";
        String str_headName = "";
        String str_nic = "";
        String str_statisticalCode = "";
        String str_pollingStation = "";
        String str_area = "";
        String str_uc = "";
        String str_charge = "";
        String str_circle = "";
        String str_block = "";
        
        
                
        Connection con = null;
        String query = "SELECT * FROM TBL_VOTER_RECORD WHERE NIC = '"+nic+"'";
        try
        {
            Class.forName(SystemConstants.DB_DRIVER_NAME);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unable to load database drivers!");
        }
        
        try
        {
            con = DriverManager.getConnection(SystemConstants.DB_URL);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                str_sr = rs.getString("SERIAL");
                str_familyNo = rs.getString("FAMILYNO");
                str_name = rs.getString("NAME");
                str_headName = rs.getString("HEADNAME");
                str_nic = rs.getString("NIC");
                str_statisticalCode = rs.getString("STATISTICALCODE");
                str_pollingStation = rs.getString("POLLINGSTATION");
                str_area = rs.getString("AREA");
                str_uc = rs.getString("UC");
            
            }
            
            if(!str_statisticalCode.isEmpty())
            {
                str_charge = str_statisticalCode.substring(3,5);
                str_circle = str_statisticalCode.substring(5,7);
                str_block = str_statisticalCode.substring(7,9);
            }
            
            
            record[0] = str_sr;
            record[1] = str_familyNo;
            record[2] = str_name;
            record[3] = str_headName;
            record[4] = str_nic;
            record[5] = str_charge;
            record[6] = str_circle;
            record[7] = str_block;
            record[8] = str_statisticalCode;
            record[9] = str_area;
            record[10] = str_uc;
            record[11] = str_pollingStation;
            
                
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unable to fetch record!");
            e.printStackTrace();
        }
        
        
        return record;
        
    }
    
    
    
    
    
     public String[] searchRecord(String query){
        
        
        
        long recordID = 0;
        String str_sr = "";
        String str_familyNo = "";
        String str_name = "";
        String str_headName = "";
        String str_nic = "";
        String str_statisticalCode = "";
        String str_pollingStation = "";
        String str_area = "";
        String str_uc = "";
        String str_charge = "";
        String str_circle = "";
        String str_block = "";
        Vector record_vector = new Vector();
        
                
        Connection con = null;
        
        try
        {
            Class.forName(SystemConstants.DB_DRIVER_NAME);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unable to load database drivers!");
        }
        
        try
        {
            con = DriverManager.getConnection(SystemConstants.DB_URL);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                recordID = rs.getLong("RECORDID");
                //str_sr = rs.getString("SERIAL");
                //str_familyNo = rs.getString("FAMILYNO");
                str_name = rs.getString("NAME");
                str_headName = rs.getString("HEADNAME");
                str_nic = rs.getString("NIC");
                //str_statisticalCode = rs.getString("STATISTICALCODE");
                //str_pollingStation = rs.getString("POLLINGSTATION");
                //str_area = rs.getString("AREA");
                //str_uc = rs.getString("UC");
                
                String str = Long.toString(recordID) + "," +  str_name + "," + str_headName + ","+ str_nic;
                record_vector.addElement(str);
            
            }
            
            
            
            
                
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unable to fetch record!");
            e.printStackTrace();
        }
        
        
        
        
        String[] record = new String[record_vector.size()];
            for(int i=0;i<=record.length-1;i++)
                record[i] = (String)record_vector.elementAt(i);
        
                
        return record;
        
    }
    
    
    
    
    
    
    
}
