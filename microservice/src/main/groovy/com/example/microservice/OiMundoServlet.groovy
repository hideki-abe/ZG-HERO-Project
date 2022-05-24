package com.example.microservice

import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(urlPatterns = "/oi")
class OiMundoServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter()
        out.println("<html>")
        out.println("<body>")
        out.println("Oi Mundo, primeiro Servlet!")
        out.println("</body>")
        out.println("</html>")
    }
}
