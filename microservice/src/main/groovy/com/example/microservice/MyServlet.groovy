package com.example.microservice

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/date.html")
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>My Web App</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>My Web App</h1>");
        out.println("<p>The current time is: " + new Date().toString() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
