<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="ServletLogin">Log ind</a>
<c:forEach var="emne" items="${requestScope.personer}">
    <br>
    ${emne.value.navn}
</c:forEach>
<br>
<br>
<h2>Her kan du logge ind</h2>
${requestScope.besked}
<br>
<form action="ServletLogin" method="post">
    <label for="uName">Angiv brugernavn:</label><br>
    <input type="text" id="uName" name="uName"><br>
    <label for="passW">Skriv adgangskode:</label><br>
    <input type="password" id="passW" name="passW"><br><br>
    <input type="submit" value="Login">
</form>
</body>
</html>