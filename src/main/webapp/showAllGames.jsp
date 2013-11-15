<%@ page import="domain.Game"%>
<%@ page import="domain.Platform" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Game storage</title>
</head>
<body>
	<jsp:useBean id="storage" class="service.GameStorageService" scope="application" />
	<center><h2>Games info:</h2></center>
	<center><table border="2">
		<center><tr bgcolor="#a2add0">
			<th colspan="3"></th>
			<th colspan="7">Platforms</th>
			<th colspan="2"></th>
		</tr></center>
		<center><tr bgcolor="#a2add0">
			<th>Name</th>
			<th>YOR</th>
			<th>Genre</th>
			<th width="60">PC</th>
			<th width="60">PS2</th>
			<th width="60">PS3</th>
			<th width="60">PS4</th>
			<th width="60">XBOX</th>
			<th width="60">XBOX360</th>
			<th width="60">XBOX1</th>
			<th>Description</th>
			<th>SCORE</th>
		</tr></center>
<%
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
%>
	</table></center>
<p>
  	<center><a href="getGameData.jsp">Add another game to the storage</a></center>
</p>
</body>
</html>