/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.UserDAO;
import entity.UserEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author admin
 */
public class Login extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    request.getRequestDispatcher("login.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    try {
      HttpSession session = request.getSession();
      //        PasswordEncryption pe = new PasswordEncryption();
      String email = request.getParameter("email");
      String password = request.getParameter("password");
      //        PasswordEncryption.encryptPassword(password);
      //        PasswordEncryption.checkPassword("password", password);
      UserDAO udao = new UserDAO();
      UserEntity user = udao.getUserByEmail(email);
      //      response.getWriter().println(userList.size());
      String mess = "Email or password wrong!";

      //      if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
      //        mess = "sign in success";
      //      } else if (mess.equals("sign in success")) {
      //        response.sendRedirect("/homePage2");
      //
      //      } else {
      //        request.setAttribute("errorMessage", mess);
      //        request.getRequestDispatcher("login.jsp").forward(request, response);
      //      }

      if ((user.getEmail().equals(email)) && user.getPassword().equals(password)) {
        response.sendRedirect("homePage2");
      } else {
        request.setAttribute("errorMessage", mess);
        request.getRequestDispatcher("login.jsp").forward(request, response);
      }
      session.setAttribute("user", user);
    } catch (Exception e) {
      response.getWriter().println(e.getMessage());
      response.getWriter().println(e.getStackTrace());
    }
        
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  } // </editor-fold>
}
