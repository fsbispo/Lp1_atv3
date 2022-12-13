package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Bispo
 */
public class ConexaoDAO {
    
    public Connection conectaBD(){
        
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://localhost/cachorro?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro);
        }
        
        
        
        return conn;
    }
    
    public static void main(String[] args) {
        
    }
    
}