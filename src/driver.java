
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hayat
 */


public class driver extends JComboBox {
    Connection conn;
    PreparedStatement ps;
    public ArrayList<DriverList> driverList(){
        ArrayList<DriverList> driversList = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/routeoptimization", "root", "1234");
            
            String query1 = "SELECT * FROM driver";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            
            DriverList drivers;
            while(rs.next()){
                drivers = new DriverList(rs.getString("name"));
                driversList.add(drivers);                
            }
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);            
        }
        catch(SQLException ex){
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return driversList;        
    }

    public driver() {
        ArrayList<DriverList> list = driverList();
        for(int i = 0; i < list.size(); i++){            
            addItem(list.get(i).getName());        
        }          
        
    }

    
}
