<%@ page import="domain.Type" %>
<%@ page import="domain.Platform" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Re-edit or accept data</title>
</head>
<body>
<jsp:useBean id="game" class="domain.Game" scope="session" />
<jsp:setProperty name="game" property="*" /> 
<jsp:useBean id="storage" class="service.GameStorageService" scope="application" />

<p><u>Is form filled correctly?</u></p>
<form action="addGame.jsp">
	<p>Name: ${game.name} <font size="2">${game.subName}</font></p>
	<p>Year: ${game.year}</p>
	<p>Type: ${game.type.getDesc()}</p>
	<p>Platforms: 
	<%	
		List<Platform> platform = new ArrayList<Platform>();
		for (Platform p : Platform.values()) {
			if (request.getParameter(p.name()) != null) {
				platform.add(p);
				out.println(p.name() + " ");
			}
		}
		
		game.setPlatform(platform);
	%>
	<p>Score: ${game.score.getNumber()}</p>
	<p>Description: ${game.description}</p>
	<input type="button" onClick="parent.location='getGameData.jsp'" value=" Return ">
 	<input type="submit" value=" OK ">
</form>

</body>
</html>