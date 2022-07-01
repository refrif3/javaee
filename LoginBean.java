/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitor.bean;

/**
 *
 * @author seynabou
 */

public class LoginBean {
  private String userName;
  private String password;
  public LoginBean(String userName, String password) {
    super();
    this.userName = userName;
    this.password = password;
  }
  public LoginBean() {
    super();
    // TODO Auto-generated constructor stub
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
}