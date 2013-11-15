<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Added game!</title>
</head>
<body>
<jsp:useBean id="game" class="domain.Game" scope="session" />
<jsp:setProperty name="game" property="*" /> 
<jsp:useBean id="storage" class="service.GameStorageService" scope="application" />
<%	
	storage.add(game);
%>

<p>${game.name} <font size="2">${game.subName}</font> has been added to storage</p>

<%
	game.clear();
%>
<p>
  <a href="showAllGames.jsp">Show all games</a>
</p>
</body>
</html>