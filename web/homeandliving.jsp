<%-- 
    Document   : homeandliving
    Created on : Jan 31, 2025, 1:37:13 PM
    Author     : chanu
--%>
<%@page import="app.classes.DbConnector"%>
<%@page import="app.classes.Products"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home & Living</title>
        <script src="https://cdn.tailwindcss.com"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" rel="stylesheet">
    </head>
    <body>
        <!-- Navbar -->
        <jsp:include page="navbar.jsp"/>
            
            <div class="container mx-auto p-6">
                <h1 class="text-3xl font-bold text-center mb-8">Home & Living Shelves</h1>

                <!-- Product Grid -->
                <div class="grid grid-cols-1 md:grid-cols-3 lg:grid-cols-4 gap-4">
                    <%
                        Connection con = null;
                        try {
                            con = DbConnector.getConnection();
                            Products productsObj = new Products();
                            List<Products> categoryProducts = productsObj.getProductsByCategory(con, "Home and Living Shelves");

                            if(categoryProducts.isEmpty()) {
                                %>
                                <div class="col-span-full text-center text-gray-500">
                                    No products found in this category.
                                </div>
                                <%
                            } else {
                                for(Products p : categoryProducts) {
                                %>
                                <a href="product.jsp?id=<%=p.getProduct_id()%>" 
                                   class="group relative bg-white rounded-lg overflow-hidden shadow-sm hover:shadow-lg transition-shadow duration-300 cursor-pointer card-zoom">
                                    <div class="relative">
                                        <img src="<%=p.getImage_url()%>" 
                                             alt="<%=p.getName()%>" 
                                             class="w-full h-48 object-cover"/>
                                    </div>
                                    <div class="p-4">
                                        <h3 class="text-sm font-medium text-gray-900"><%=p.getName()%></h3>
                                        <p class="mt-1 text-xs text-gray-500"><%=p.getCategory()%></p>
                                        <p class="mt-1 text-sm font-medium text-gray-900">Rs. <%=String.format("%.2f", p.getPrice())%></p>
                                    </div>
                                </a>
                                <%
                                }
                            }
                        } catch (Exception e) {
                            out.println("<div class='col-span-full text-center text-red-500'>Error loading products: " + e.getMessage() + "</div>");
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
            </div>
                
            
        <!-- Footer -->
        <jsp:include page="footer.jsp"/>
        
    </body>
</html>
