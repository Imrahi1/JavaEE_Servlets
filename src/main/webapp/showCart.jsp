<%@ page import="com.imrahil.javaee_servlets.Cart" %><%--
  Created by IntelliJ IDEA.
  User: chish
  Date: 05.10.2023
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <%@page import="com.imrahil.javaee_servlets.Cart" %>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName() %> </p>
    <p> Количество: <%= cart.getQuntity() %> </p>
</body>
</html>
