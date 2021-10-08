package com.sample.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", value = "/HelloServlet",urlPatterns = "/test")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Hello");

        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        printWriter.write("<head>");
        printWriter.write("</head>");
        printWriter.write("<body>");
        printWriter.write("<h1>"+"Hello"+"</h1>");
        printWriter.write("</body>");
        printWriter.write("</html>");
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
