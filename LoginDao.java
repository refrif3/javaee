/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitor.dao;

/**
 *
 * @author seynabou
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import monitor.bean.LoginBean;

public class LoginDao {
  public boolean vaildate(LoginBean bean)
  {
    boolean result = false;
    Connection connection=DBconnect.getConn();
    String sql="select * from User where Username=? and Password=?";
    try {
      PreparedStatement ps=connection.prepareStatement(sql);
      ps.setString(1, bean.getUserName());
      ps.setString(2, bean.getPassword());
      ResultSet rs=ps.executeQuery();
      result=rs.next();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }    
    return result;
  }
}