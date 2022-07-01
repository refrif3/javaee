package com.example.testjee;

import beans.LoginBean;
import beans.LoginDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Connexion", value = "/")
public class Connexion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/connexion.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginBean loginBean = new LoginBean();
        String password;
        password = null;
        String username;
        username = null;
        loginBean.setPassword(password);
        loginBean.setUsername(username);

        LoginDao loginDao = new LoginDao();

        String test = loginDao.verification(loginBean);
        String login = request.getParameter("login");
        String passwd = request.getParameter("passwd");

        if (login.equals("gora") && passwd.equals("root")){
            HttpSession session = request.getSession();
            session.setAttribute("login", login);
            response.sendRedirect( request.getContextPath() + "/acceuil.jsp");
        }else {
            String err = "Error de connexion";
            request.setAttribute("err", err);
            this.getServletContext().getRequestDispatcher("/connexion.jsp").forward(request, response);
        }
    }
}
