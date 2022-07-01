package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
    public String verification(LoginBean loginBean){
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test","java","Root3306.");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select username, passwd from user");
            while(rs.next()){
                String username1 = rs.getString("username");
                String passwd1 = rs.getString("passwd");
                if (username.equals(username1) && password.equals(passwd1)){
                    return "Existe";
                }else {
                    return "NotFound";
                }
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return "username";
    }
}
