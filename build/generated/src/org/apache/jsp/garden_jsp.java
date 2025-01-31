package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.DbConnector;
import app.classes.Products;
import java.sql.Connection;
import java.util.List;

public final class garden_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>garden</title>\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container mx-auto p-6\">\n");
      out.write("                <h1 class=\"text-3xl font-bold text-center mb-8\">Garden Shelves</h1>\n");
      out.write("\n");
      out.write("                <!-- Product Grid -->\n");
      out.write("                <div class=\"grid grid-cols-1 md:grid-cols-3 lg:grid-cols-4 gap-4\">\n");
      out.write("                    ");

                        Connection con = null;
                        try {
                            con = DbConnector.getConnection();
                            Products productsObj = new Products();
                            List<Products> categoryProducts = productsObj.getProductsByCategory(con, "garden Shelves");

                            if(categoryProducts.isEmpty()) {
                                
      out.write("\n");
      out.write("                                <div class=\"col-span-full text-center text-gray-500\">\n");
      out.write("                                    No products found in this category.\n");
      out.write("                                </div>\n");
      out.write("                                ");

                            } else {
                                for(Products p : categoryProducts) {
                                
      out.write("\n");
      out.write("                                <a href=\"product.jsp?id=");
      out.print(p.getProduct_id());
      out.write("\" \n");
      out.write("                                   class=\"group relative bg-white rounded-lg overflow-hidden shadow-sm hover:shadow-lg transition-shadow duration-300 cursor-pointer card-zoom\">\n");
      out.write("                                    <div class=\"relative\">\n");
      out.write("                                        <img src=\"");
      out.print(p.getImage_url());
      out.write("\" \n");
      out.write("                                             alt=\"");
      out.print(p.getName());
      out.write("\" \n");
      out.write("                                             class=\"w-full h-48 object-cover\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"p-4\">\n");
      out.write("                                        <h3 class=\"text-sm font-medium text-gray-900\">");
      out.print(p.getName());
      out.write("</h3>\n");
      out.write("                                        <p class=\"mt-1 text-xs text-gray-500\">");
      out.print(p.getCategory());
      out.write("</p>\n");
      out.write("                                        <p class=\"mt-1 text-sm font-medium text-gray-900\">Rs. ");
      out.print(String.format("%.2f", p.getPrice()));
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                ");

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
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
