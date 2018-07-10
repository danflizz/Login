/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.model;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author dflores
 */
public class Queries extends ConnectionHelper{
    
    public boolean Authentication(String user, String pswd){
        if(user != null && !user.isEmpty() && pswd != null && !pswd.isEmpty()){
        System.out.println("user "+user +" pswd "+pswd);
        try {
            Statement statement = con.createStatement();
            ResultSet rs = null;
            String query = "SELECT * FROM users";
            rs = statement.executeQuery(query);
            if(rs != null){
            while(rs.next()){
                System.out.println("user pswd "+rs.getString("user_pswd"));
                System.out.println("user name "+rs.getString("user_name"));
                if(user.equals(rs.getString("user_name")) && pswd.equals(rs.getString("user_pswd"))){
                    return true;
                }
            }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Queries query = new Queries();
     
    }
    
    
    
}
