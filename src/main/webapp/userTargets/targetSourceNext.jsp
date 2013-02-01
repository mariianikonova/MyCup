<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
Welcome to NEXT page in Your source!
<c:url var="targetUrl" value="/userTargets/targetSource.jsp"/>
<a href="${targetUrl}">Your Page</a>
<c:url var="logoutAction" value="/auth/LogoutServlet"/>
<form action="${logoutAction}" method="post">
    <input type="submit" value="Logout"/>
</form>
</body>
</html>