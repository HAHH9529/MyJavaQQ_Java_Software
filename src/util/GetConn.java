/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 10248
 */
public class GetConn {

    public static Connection GetConn() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;datebaseName=TX_MyJavaQQ_DB","sa","990401");
    }
    
}
