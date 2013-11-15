package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.Game;
import domain.Platform;

public final class showAllGames_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>Game storage</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      service.GameStorageService storage = null;
      synchronized (application) {
        storage = (service.GameStorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new service.GameStorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t<center><h2>Games info:</h2></center>\n");
      out.write("\t<center><table border=\"2\">\n");
      out.write("\t\t<center><tr bgcolor=\"#a2add0\">\n");
      out.write("\t\t\t<th colspan=\"3\"></th>\n");
      out.write("\t\t\t<th colspan=\"7\">Platforms</th>\n");
      out.write("\t\t\t<th colspan=\"2\"></th>\n");
      out.write("\t\t</tr></center>\n");
      out.write("\t\t<center><tr bgcolor=\"#a2add0\">\n");
      out.write("\t\t\t<th>Name</th>\n");
      out.write("\t\t\t<th>YOR</th>\n");
      out.write("\t\t\t<th>Genre</th>\n");
      out.write("\t\t\t<th width=\"60\">PC</th>\n");
      out.write("\t\t\t<th width=\"60\">PS2</th>\n");
      out.write("\t\t\t<th width=\"60\">PS3</th>\n");
      out.write("\t\t\t<th width=\"60\">PS4</th>\n");
      out.write("\t\t\t<th width=\"60\">XBOX</th>\n");
      out.write("\t\t\t<th width=\"60\">XBOX360</th>\n");
      out.write("\t\t\t<th width=\"60\">XBOX1</th>\n");
      out.write("\t\t\t<th>Description</th>\n");
      out.write("\t\t\t<th>SCORE</th>\n");
      out.write("\t\t</tr></center>\n");

  for (Game game : storage.getAllGames()) {
	  out.println("<tr bgcolor=\"#b7c4ec\"><td><center>" + game.getName() + "</center><center><font size=\"2\">" + game.getSubName() + "</font></center></td>" +
	  "<td>" + game.getYear() + "</td>" +
	  "<td><center>" + game.getType().getDesc() + "</center></td>");
	  
	  int i = 0;
	  for (Platform p : Platform.values()) {
	  	  out.println("<td><center>");
	  	  
		  if (game.isPlatform(p))
			  out.println("yes");
		  else
			  out.println("");
		  
		  out.println("</center></td>");
	  }
	  
	  out.println("<td>" + game.getDescription() + "</td>" +
	  "<td><b>" + game.getScore().getNumber() + "</b></td></tr>"
	  );
  }

      out.write("\n");
      out.write("\t</table></center>\n");
      out.write("<p>\n");
      out.write("  \t<center><a href=\"getGameData.jsp\">Add another game to the storage</a></center>\n");
      out.write("</p>\n");
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
