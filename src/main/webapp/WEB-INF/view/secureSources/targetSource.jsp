<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
</head>
<body>
Welcome to Your source!
<c:url var="targetUrl" context="/app" value="/targetSourceNext"/>
<a href="${targetUrl}">Your NEXT Page</a>
<c:url var="logoutAction" context="/app" value="/j_spring_security_logout"/>
<form action="${logoutAction}" method="post">
    <input type="submit" value="Logout"/>
</form>
</form>
</body>
</html>