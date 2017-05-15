/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.GetConn;

/**
 *
 * @author 10248
 */
public class UserDao {
    public int userRegister(User user) throws SQLException {
        Connection conn = GetConn.GetConn();
        PreparedStatement ps = conn.prepareStatement("use TX_MyJavaQQ_DB exec dbo.proc_CreateQQ ?,?,?,?,?,?");
        ps.setString(1, user.getUserNickname());
        ps.setString(2, user.getUserPassword());
        ps.setString(3, user.getUserSex());
        ps.setString(4, user.getUserBirthday());
        ps.setString(5, user.getUserAddress());
        ps.setString(6, user.getUserPhone());
        ResultSet rs = ps.executeQuery();
        int ret = rs.getInt("User_Number");
        return ret;
    }
}
