/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes;


import java.sql.Connection;

/**
 *
 * @author Lukas
 */
public class ConnectionManager { //Class for connecting to the database
    
    
    private final SQLServerDataSource ds = new SQLServerDataSource();
    
    public ConnectionManager() { //User details for connecting to the database
        ds.setDatabaseName("Name");
        ds.setUser("user");
        ds.setPassword("password");
        ds.setPortNumber(1433);
        ds.setServerName("localhost");
    }
    
    
     public Connection getConnection() throws SQLServerException //Initializes the connection to the database
    {
        return ds.getConnection();
    }
     
     
    
}
