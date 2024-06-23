package com.iss.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

import com.iss.dao.*;


public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static UserDao  userDao = new UserDaoImp();

    public LoginServlet() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (userDao.isValidUser(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
            System.out.println("Error");
        }
    }

}