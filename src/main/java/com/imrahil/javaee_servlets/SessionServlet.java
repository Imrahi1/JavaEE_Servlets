package com.imrahil.javaee_servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();                 // Получаем объект сессии с информацией о пользователе (cookie)
        // Для каждого браузера на странице свои cookie.
        // У сессии есть таймаут в JavaEE это 30 мин вроде.

        Integer count = (Integer) session.getAttribute("count"); // Получаем атрибут count даже если мы его еще не создавали
        // Так как getAttribute возвращает Object, мы можем преобразовать ее в любой объект с помощью скобок

        if (count == null) {
            session.setAttribute("count", 1); // Устанавливаем в атрибут значение
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Your count is "+count+" </h1>");
        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
