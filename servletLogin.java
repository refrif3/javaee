/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package monitor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import monitor.bean.LoginBean;
import monitor.dao.LoginDao;

/**
 *
 * @author seynabou
 */
@WebServlet(name = "servleLogin", urlPatterns = {"/servleLogin"})
public class servletLogin extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
      response.setContentType("text/html");
      String uname=request.getParameter("username");
      String pass=request.getParameter("password");
      LoginBean bean=new LoginBean();
      LoginDao dao=new LoginDao();
      bean.setUserName(uname);
      bean.setPassword(pass);
      if(dao.vaildate(bean))
      {
        response.sendRedirect("dashbord.html");
      }
      else
      {
        response.sendRedirect("connexion.html");
      }
  }
}
