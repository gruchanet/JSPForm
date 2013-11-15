<%@ page import="domain.Type" %>
<%@ page import="domain.Platform" %>
<%@ page import="domain.Score" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>A simple game form</title>
</head>
<body>

<jsp:useBean id="storage" class="service.GameStorageService" scope="application" />
<jsp:useBean id="game" class="domain.Game" scope="session" />

<form action="acceptGame.jsp">

  Game name: <input type="text" name="name" placeholder="name of the game" value="${game.name}"/><br />
  Game sub-name: <input type="text" name="subName" placeholder="subname of the game" value="${game.subName}"/><br />
  Year of release: <input type="text"  name="year" placeholder="year when the game was released" value="${game.year}"/><br /><br />
  <u>Select proper genre of the game</u><br />
  <%
  	for (Type t : Type.values()) {
  		if (!t.equals(Type.NONE)) {
	  		out.println("<input type=\"radio\" name=\"type\" value=\"" + t.name() + "\" ");
	  		
	  		if (game.getType().equals(t))
	  			out.println("checked");
	  		out.print(">" + t.getDesc() + "<br />");
  		}
  	}
  %>
  <br />
  <u>Tick proper game platforms</u><br />
  <%
  	for (Platform p : Platform.values()) {
  		out.println("<input type=\"checkbox\" name=\""+ p.name() +"\" "); // 'value' instead of 'name'?
  				
  		if (game.isPlatform(p))
  			out.println("checked");
  		out.print(">" + p.getDesc() + "<br />");
  	}
  %>
  <br />
  <u>Select game score</u><br />
  <select name="score" size="5">
  <%
  	for (Score s : Score.values()) {
  		out.println("<option value=\"" + s.name() + "\" ");
  		
  		if (game.getScore().equals(s))
  			out.println("selected");
  		out.print(">" + s.getDesc() + "<br />");
  	}
  %>
  </select><br /><br />
  <u>Write short game description:</u><br />
  <textarea name="description" rows="8" cols="50" placeholder="Write something here..."}>${game.description}</textarea><br /><br />
  <input type="reset" value=" Reset " onClick="<% game.clear(); %>"/>
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>