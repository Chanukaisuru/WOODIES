package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Cart</title>\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar -->\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Banner Section -->\n");
      out.write("        <div class=\"relative\">\n");
      out.write("            <img src=\"resources/images/heading_cover/cover.png\" alt=\"Checkout Banner\" class=\"w-full h-[328px] object-cover\">\n");
      out.write("            <div class=\"absolute inset-0 flex flex-col items-center justify-center bg-black bg-opacity-30 text-center\">\n");
      out.write("                <h1 class=\"text-4xl font-bold text-white\">Cart</h1>\n");
      out.write("                <p class=\"text-white text-sm mt-2\">\n");
      out.write("                    <a href=\"home.jsp\" class=\"hover:text-[#b68f2f]\">Home</a> &gt; <span>Cart</span>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Cart Section -->\n");
      out.write("        <div class=\"container mx-auto px-4 py-8 mt-16 mb-16\">\n");
      out.write("            <h1 class=\"text-3xl font-semibold text-center mb-6\">Your Cart</h1>\n");
      out.write("            <div class=\"flex flex-col lg:flex-row gap-8\">\n");
      out.write("                <!-- Cart Items -->\n");
      out.write("                <div class=\"w-full lg:w-2/3 overflow-x-auto\">\n");
      out.write("                    <table class=\"w-full bg-white shadow rounded-lg\">\n");
      out.write("                        <thead class=\"bg-[#f9f0e7]\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\"text-left px-4 py-2 text-gray-600\">Product</th>\n");
      out.write("                                <th class=\"text-left px-4 py-2 text-gray-600\">Price</th>\n");
      out.write("                                <th class=\"text-center px-4 py-2 text-gray-600\">Quantity</th>\n");
      out.write("                                <th class=\"text-right px-4 py-2 text-gray-600\">Subtotal</th>\n");
      out.write("                                <th class=\"text-center px-4 py-2 text-gray-600\">Remove</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr class=\"border-b\">\n");
      out.write("                                <td class=\"flex items-center px-4 py-2\">\n");
      out.write("                                    <img src=\"resources/images/slider_container/card2.jpg\" alt=\"Product Image\" class=\"h-16 w-16 object-cover rounded mr-2\">\n");
      out.write("                                    <span>Wooden Shelf</span>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"px-4 py-2\">$120</td>\n");
      out.write("                                <td class=\"px-4 py-2 text-center\">\n");
      out.write("                                    <input type=\"number\" value=\"1\" class=\"w-12 border rounded text-center\">\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"px-4 py-2 text-right\">$120</td>\n");
      out.write("                                <td class=\"px-4 py-2 text-center\">\n");
      out.write("                                    <button class=\"text-yellow-500 hover:text-red-500\">\n");
      out.write("                                        <i class=\"fas fa-trash-alt\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Cart Summary -->\n");
      out.write("                <div class=\"w-full lg:w-1/3 bg-[#f9f0e7] shadow rounded-lg p-6\">\n");
      out.write("                    <h2 class=\"text-xl font-semibold mb-4\">Cart Totals</h2>\n");
      out.write("                    <div class=\"mb-4 flex justify-between\">\n");
      out.write("                        <span>Subtotal</span>\n");
      out.write("                        <span>$120</span>\n");
      out.write("                    </div>\n");
      out.write("                    <hr class=\"border-t border-gray-300 my-2\">\n");
      out.write("                    <div class=\"flex justify-between font-bold text-lg\">\n");
      out.write("                        <span>Total</span>\n");
      out.write("                        <span class=\"text-yellow-500\">$120</span>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"checkout.jsp\">\n");
      out.write("                        <button class=\"w-full mt-6 bg-yellow-500 text-white py-2 rounded hover:bg-yellow-600\">\n");
      out.write("                            Check Out\n");
      out.write("                        </button>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Features Section -->\n");
      out.write("        <section class=\"bg-[#faf7f0] py-10 border-t border-gray-200\">\n");
      out.write("            <div class=\"container mx-auto px-6 grid grid-cols-2 md:grid-cols-4 gap-6 text-center\">\n");
      out.write("                <!-- Feature 1 -->\n");
      out.write("                <div class=\"flex items-center md:items-start\">\n");
      out.write("                    <div class=\"text-yellow-500 text-4xl mr-4\">\n");
      out.write("                        <i class=\"fas fa-trophy\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"text-lg font-bold text-gray-800\">High Quality</h3>\n");
      out.write("                        <p class=\"text-gray-600 text-sm\">crafted from top materials</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Feature 2 -->\n");
      out.write("                <div class=\"flex items-center md:items-start\">\n");
      out.write("                    <div class=\"text-yellow-500 text-4xl mr-4\">\n");
      out.write("                        <i class=\"fas fa-shield-alt\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"text-lg font-bold text-gray-800\">Warranty Protection</h3>\n");
      out.write("                        <p class=\"text-gray-600 text-sm\">Over 2 years</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Feature 3 -->\n");
      out.write("                <div class=\"flex items-center md:items-start\">\n");
      out.write("                    <div class=\"text-yellow-500 text-4xl mr-4\">\n");
      out.write("                        <i class=\"fas fa-box\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"text-lg font-bold text-gray-800\">Free Shipping</h3>\n");
      out.write("                        <p class=\"text-gray-600 text-sm\">Order over 150$</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Feature 4 -->\n");
      out.write("                <div class=\"flex items-center md:items-start\">\n");
      out.write("                    <div class=\"text-yellow-500 text-4xl mr-4\">\n");
      out.write("                        <i class=\"fas fa-headset\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"text-lg font-bold text-gray-800\">24 / 7 Support</h3>\n");
      out.write("                        <p class=\"text-gray-600 text-sm\">Dedicated support</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
