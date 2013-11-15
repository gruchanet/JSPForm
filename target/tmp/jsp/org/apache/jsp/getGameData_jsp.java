package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.Type;
import domain.Platform;
import domain.Score;

public final class getGameData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>A simple game form</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      service.GameStorageService storage = null;
      synchronized (application) {
        storage = (service.GameStorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new service.GameStorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      domain.Game game = null;
      synchronized (session) {
        game = (domain.Game) _jspx_page_context.getAttribute("game", PageContext.SESSION_SCOPE);
        if (game == null){
          game = new domain.Game();
          _jspx_page_context.setAttribute("game", game, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"acceptGame.jsp\">\n");
      out.write("\n");
      out.write("  Game name: <input type=\"text\" name=\"name\" placeholder=\"name of the game\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${game.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br />\n");
      out.write("  Game sub-name: <input type=\"text\" name=\"subName\" placeholder=\"subname of the game\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${game.subName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br />\n");
      out.write("  Year of release: <input type=\"text\"  name=\"year\" placeholder=\"year when the game was released\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${game.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br /><br />\n");
      out.write("  <u>Select proper genre of the game</u><br />\n");
      out.write("  ");

  	for (Type t : Type.values()) {
  		if (!t.equals(Type.NONE)) {
	  		out.println("<input type=\"radio\" name=\"type\" value=\"" + t.name() + "\" ");
	  		
	  		if (game.getType().equals(t))
	  			out.println("checked");
	  		out.print(">" + t.getDesc() + "<br />");
  		}
  	}
  
      out.write("\n");
      out.write("  <br />\n");
      out.write("  <u>Tick proper game platforms</u><br />\n");
      out.write("  ");

  	for (Platform p : Platform.values()) {
  		out.println("<input type=\"checkbox\" name=\""+ p.name() +"\" "); // 'value' instead of 'name'?
  				
  		if (game.isPlatform(p))
  			out.println("checked");
  		out.print(">" + p.getDesc() + "<br />");
  	}
  
      out.write("\n");
      out.write("  <br />\n");
      out.write("  <u>Select game score</u><br />\n");
      out.write("  <select name=\"score\" size=\"5\">\n");
      out.write("  ");

  	for (Score s : Score.values()) {
  		out.println("<option value=\"" + s.name() + "\" ");
  		
  		if (game.getScore().equals(s))
  			out.println("selected");
  		out.print(">" + s.getDesc() + "<br />");
  	}
  
      out.write("\n");
      out.write("  </select><br /><br />\n");
      out.write("  <u>Write short game description:</u><br />\n");
      out.write("  <textarea name=\"description\" rows=\"8\" cols=\"50\" placeholder=\"Write something here...\"}>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${game.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea><br /><br />\n");
      out.write("  <input type=\"reset\" value=\" Reset \" onClick=\"");
 game.clear(); 
      out.write("\"/>\n");
      out.write("  <input type=\"submit\" value=\" OK \">\n");
      out.write("  \n");
      out.write("</form>\n");
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
