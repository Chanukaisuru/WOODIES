<%-- 
    Document   : login_back
    Created on : Jan 31, 2025, 2:47:34 AM
    Author     : chanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="app.classes.User"%>
<%@page import="app.classes.DbConnector"%>

<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
User user = new User(email,password);
if("admin@gmail.com".equals(email) && "admin".equals(password)){
    session.setAttribute("email", email);
    response.sendRedirect("admin/admin.jsp");
}else{
    if(user.authenticate(DbConnector.getConnection())){
        session.setAttribute("user_id", user.getId());
        response.sendRedirect("../home.jsp");       //change
    }else{
        response.sendRedirect("login_signup/login.jsp?s=0");       //change
    }

}

%>