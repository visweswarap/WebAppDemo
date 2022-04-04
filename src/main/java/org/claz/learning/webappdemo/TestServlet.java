package org.claz.learning.webappdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet", value = "/TestServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get method............");
        response.sendRedirect("./test.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Post method............");
        String message = null;
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if (validateLogin(user, pass)){
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
        // response.setContentType("text/html");

//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1> "+ message +" </h1>");
//        out.println("</body></html>");
    }

    boolean validateLogin(String username, String password) {
        String user = "john";
        String pass = "doe";
        if(user.equals(username) && pass.equals(password)){
            return true;
        } else {
            return false;
        }
    }
}
