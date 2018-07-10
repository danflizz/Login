/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.model;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

/**
 *
 * @author dflores
 */
public class ConnectionHelper {
    
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "data";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE;
    
    public java.sql.Connection con;
    
    public ConnectionHelper(){
        try{
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                    
        }catch(ClassNotFoundException e){
            System.out.println("Error");
        }catch(SQLException e){
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args) {
        ConnectionHelper c = new ConnectionHelper();
    }
}
