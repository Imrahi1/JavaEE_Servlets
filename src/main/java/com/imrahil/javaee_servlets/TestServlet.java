package com.imrahil.javaee_servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet", value = "/TestServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.sendRedirect("https://www.google.com");     // redirect перенаправление пользователя на URL
        //response.sendRedirect("/testJSP.jsp");              // redirect перенаправление пользователя на JSP

        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJSP.jsp"); // forward перенаправление пользователя на JSP
        // forward может перенаправить только на внутринние адреса*
        dispatcher.forward(request,response);
        // при этом объект запроса не меняется, а просто перенаправляется, передается следующей сущности не меняясь
        // Браузер же обращаясь по адресу /test-servlet попадает на содержимое адреса test-JSP
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
