import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
    
    
class data{
    

    public static void main(String[] args){
        String USERNAME = "root";
        String PASSWORD = "Dangel102";
        String CONN_STRING = "jdbc:mysql://local:3306/local";
        
        Connection con;
        
        Statement stmt;
                
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jbdc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = con.createStatement();
            stmt.executeUpdate("insert into local.user(iduser, user, password, lastsession) values(2, 'Daniel', 'villarreal3', now());");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
    }
}