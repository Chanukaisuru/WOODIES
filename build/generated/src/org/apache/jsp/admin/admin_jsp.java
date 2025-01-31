package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import app.classes.Products;
import app.classes.DbConnector;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Panel</title>\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-gray-100 text-sm\">\n");
      out.write("\n");
      out.write("    <!-- Admin Header -->\n");
      out.write("    <header class=\"bg-blue-600 text-white py-4\">\n");
      out.write("        <div class=\"container mx-auto flex justify-between items-center\">\n");
      out.write("            <h1 class=\"text-2xl font-bold\">Admin Panel</h1>\n");
      out.write("            <button class=\"bg-red-500 px-4 py-2 rounded hover:bg-red-600\">\n");
      out.write("                <a href=\"/logout\">Log Out</a>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- Admin Content -->\n");
      out.write("    <div class=\"container mx-auto my-8\">\n");
      out.write("        <!-- Add Product Section -->\n");
      out.write("        <section class=\"bg-white p-6 rounded shadow mb-8\">\n");
      out.write("            <h2 class=\"text-xl font-semibold mb-4\">Add New Product</h2>\n");
      out.write("            <form action=\"admin_back.jsp\" method=\"POST\" class=\"space-y-4\">\n");
      out.write("                <div class=\"grid grid-cols-1 md:grid-cols-2 gap-4\">\n");
      out.write("                    <div>\n");
      out.write("                        <label class=\"block font-medium text-gray-700\">Product Name</label>\n");
      out.write("                        <input type=\"text\" name=\"name\" class=\"w-full px-4 py-2 border rounded\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <label class=\"block font-medium text-gray-700\">Category</label>\n");
      out.write("                       <select name=\"category\" class=\"w-full px-4 py-2 border rounded\" required>\n");
      out.write("                            <option value=\"Home and Living Shelves\">Home and Living Shelves</option>\n");
      out.write("                            <option value=\"Kitchen and Dining Shelves\">Kitchen and Dining Shelves</option>\n");
      out.write("                            <option value=\"Garden Shelves\">Garden Shelves</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid grid-cols-1 md:grid-cols-2 gap-4\">\n");
      out.write("                    <div>\n");
      out.write("                        <label class=\"block font-medium text-gray-700\">Image URL</label>\n");
      out.write("                        <input type=\"text\" name=\"image_url\" class=\"w-full px-4 py-2 border rounded\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <label class=\"block font-medium text-gray-700\">Price</label>\n");
      out.write("                        <input type=\"number\" step=\"0.01\" name=\"price\" class=\"w-full px-4 py-2 border rounded\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <label class=\"block font-medium text-gray-700\">Quantity</label>\n");
      out.write("                        <input type=\"number\"  name=\"quantity\" class=\"w-full px-4 py-2 border rounded\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div >\n");
      out.write("                        <label class=\"block font-medium text-gray-700\">Description</label>\n");
      out.write("                        <textarea name=\"description\" rows=\"4\" class=\"w-full px-4 py-2 border rounded\" required></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"bg-blue-600 text-white px-6 py-2 rounded hover:bg-blue-700\">\n");
      out.write("                    Add Product\n");
      out.write("                </button>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            ");
 
                // Show success or error messages
                String status = request.getParameter("s");
                if ("1".equals(status)) {
            
      out.write("\n");
      out.write("                    <p style=\"color: green;\">Product added successfully!</p>\n");
      out.write("            ");

                } else if ("0".equals(status)) {
            
      out.write("\n");
      out.write("                    <p style=\"color: red;\">Failed to add product. Please try again.</p>\n");
      out.write("            ");

                } else if ("2".equals(status)) {

      out.write("\n");
      out.write("                    <p style=\"color: green;\">Product deleted successfully!</p>\n");
      out.write("            ");

                } else if ("3".equals(status)) {
            
      out.write("\n");
      out.write("                    <p style=\"color: red;\">Failed to delete product. Please try again.</p>\n");
      out.write("            ");

                }else if ("4".equals(status)) {
            
      out.write("\n");
      out.write("                <p style=\"color: red;\">Product not found for update.</p>\n");
      out.write("            ");

            } else if ("5".equals(status)) {
            
      out.write("\n");
      out.write("                <p style=\"color: green;\">Product updated successfully!</p>\n");
      out.write("            ");

            } else if ("6".equals(status)) {
            
      out.write("\n");
      out.write("                <p style=\"color: red;\">Failed to update product. Please try again.</p>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <!-- Update/Delete Product Section -->\n");
      out.write("        <section class=\"bg-white p-6 rounded shadow mb-8\">\n");
      out.write("            <h2 class=\"text-xl font-semibold mb-4\">Manage Products</h2>\n");
      out.write("            <!-- Example table displaying products -->\n");
      out.write("            <table class=\"w-full border-collapse border border-gray-300 text-left\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr class=\"bg-gray-200\">\n");
      out.write("                        <th class=\"border border-gray-300 px-4 py-2\">Product ID</th>\n");
      out.write("                        <th class=\"border border-gray-300 px-4 py-2\">Name</th>\n");
      out.write("                        <th class=\"border border-gray-300 px-4 py-2\">image</th>\n");
      out.write("                        <th class=\"border border-gray-300 px-4 py-2\">Category</th>\n");
      out.write("                        <th class=\"border border-gray-300 px-4 py-2\">Price</th>\n");
      out.write("                        <th class=\"border border-gray-300 px-4 py-2\">quantity</th>\n");
      out.write("                        <th class=\"border border-gray-300 px-4 py-2\">Description</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                ");
 
                    Connection con = DbConnector.getConnection();
                    List<Products> productsList = new Products().getAllProducts(con);
                    int rowIndex = 0; // Add this counter
                    for (Products p : productsList) {
                        rowIndex++; // Increment for each row
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
 System.out.println("Row " + rowIndex + ": Displaying product ID=" + p.getProduct_id()); 
      out.write("\n");
      out.write("\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">\n");
      out.write("                        ");
      out.print( p.getProduct_id() );
      out.write(" \n");
      out.write("                         ");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">");
      out.print( p.getName() );
      out.write("</td>\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">");
      out.print( p.getImage_url() );
      out.write("</td>\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">");
      out.print( p.getCategory() );
      out.write("</td>\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">");
      out.print( p.getPrice() );
      out.write("</td>\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">");
      out.print( p.getQuantity() );
      out.write("</td>\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">");
      out.print( p.getDescription() );
      out.write("</td>\n");
      out.write("                    <td class=\"border border-gray-300 px-4 py-2\">\n");
      out.write("                        <div class=\"flex flex-col space-y-2\">\n");
      out.write("                            <button class=\"bg-yellow-500 text-white px-4 py-2 rounded hover:bg-yellow-600\">\n");
      out.write("                                <a href=\"updateProduct.jsp?product_id=");
      out.print( p.getProduct_id() );
      out.write("\">Update</a>\n");
      out.write("                            </button>\n");
      out.write("                            <form action=\"deleteProduct.jsp\" method=\"POST\">\n");
      out.write("                                <input type=\"hidden\" name=\"product_id\" value=\"");
      out.print( p.getProduct_id() );
      out.write("\">\n");
      out.write("                                <button type=\"submit\" \n");
      out.write("                                        class=\"bg-red-500 text-white px-4 py-2 rounded hover:bg-red-600\"\n");
      out.write("                                        onclick=\"return confirm('Confirm delete Product ID: ");
      out.print( p.getProduct_id() );
      out.write(" (Row: ");
      out.print( rowIndex );
      out.write(")?');\">\n");
      out.write("                                    Delete\n");
      out.write("                                </button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("            </table>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
