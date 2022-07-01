package model;

import java.sql.*;

public class Connexion {

    public static void conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test","java","Root3306.");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from tt");
            while(rs.next())
                System.out.println(rs.getString("prenom"));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

    public static void main(String[] args) {
        conn();
    }

}


