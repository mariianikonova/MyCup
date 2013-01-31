<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html public "-//w3c//dtd html 4.0 transitional//en">

<html>
<head>
    <title>startPage</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
</head>

<body>
<p>
    You are welcome!
</p>

<p>
    <c:url var="targetUrl" value="/userTargets/targetSource.jsp"/>
    <a href="${targetUrl}">Your Page</a>

</p>
<p>
    <c:url var="urlToAuth" value="/auth/loginPage.jsp"/>
    <a href="${urlToAuth}">Login Page</a>
</p>
<c:url var="logoutAction" value="/auth/LogoutServlet"/>
<form action="${logoutAction}" method="post">
    <input type="submit" value="Logout"/>
</form>
</body>
</html>