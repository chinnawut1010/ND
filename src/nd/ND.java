/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nd;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ND {

    
  

    
   


    public static Connection connectDB() {
        String db_name = "ndclinic";///Ti
        String user ="root";
        String pwd ="";
        String hostName = "localhost:3306";
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            String url="jdbc:mysql://"+hostName+"/"+db_name;
            Connection con=DriverManager.getConnection(url, user, pwd);

            return con;
        } catch(SQLException e) {
            System.out.println("Connect Link Failed");
        } catch(ClassNotFoundException ex){
            System.out.println("Please Install Driver");}
        
        return null;
    }
    
    
    
       public static void main(String args[]) {
        /* Set the Nimbus look and feel */
     //   connectDB();
        Connection con = connectDB();
        
        try {
            con.prepareStatement ("Insert into district(d_code,d_name_th,d_name_en)value (1,1,1) ").executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ND.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new Employee_login().setVisible(true);
    }
}
    /**
     * @param args the command line arguments
     */
  

