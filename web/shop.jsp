<%-- 
    Document   : shop
    Created on : Jan 31, 2025, 12:22:46 PM
    Author     : chanu
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="app.classes.DbConnector"%>
<%@page import="app.classes.Products"%>
<%@page import="app.classes.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!User user = new User();Products products=new Products();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>shop</title>
        <script src="https://cdn.tailwindcss.com"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" rel="stylesheet">
    </head>
    <body>
        <!-- Navbar -->
         <jsp:include page="navbar.jsp"/>
        
        
        <div class="max-w-6xl mx-auto p-6">
        <!-- Product Grid -->
        <div class="grid grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4">
            <%
                Connection con = null;
                try {
                    con = DbConnector.getConnection();
                    List<Products> productList = products.getAllProducts(con);
                    for(Products p : productList){
                %>
                    <!-- Product Card -->
                    <a href="product.jsp?id=<%=p.getProduct_id()%>" class="group relative bg-white rounded-lg overflow-hidden shadow-sm hover:shadow-lg transition-shadow duration-300 cursor-pointer card-zoom">
                        <div class="relative">
                            <img src="<%=p.getImage_url()%>" alt="<%=p.getName()%>" class="w-full h-48 object-cover"/>
                        </div>
                        <div class="p-4">
                            <h3 class="text-sm font-medium text-gray-900"><%=p.getName()%></h3>
                            <p class="mt-1 text-xs text-gray-500"><%=p.getCategory()%></p>
                            <p class="mt-1 text-sm font-medium text-gray-900">Rs. <%=p.getPrice()%></p>
                        </div>
                    </a>
                <% 
                    } 
                } catch (Exception e) {
                    out.println("<p>Error loading products: " + e.getMessage() + "</p>");
                    e.printStackTrace();
                } finally {
                    if (con != null) {
                        try {
                            con.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                %>
           
            
            
        </div>
        <!-- Footer -->
        <jsp:include page="footer.jsp"/>
        </div>
         

        
        
        
    </body>
</html>

