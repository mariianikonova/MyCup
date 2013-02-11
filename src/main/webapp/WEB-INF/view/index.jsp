<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<p><c:url var="targetUrl" context="/app" value="/targetSource"/>
    <a href="${targetUrl}">Your Page</a>
</p>

<p>
    <c:url var="urlToAuth" context="/app" value="/loginPage"/>
    <a href="${urlToAuth}">Login Page</a>
</p>
<c:url var="logoutAction" context="/app" value="/logoutAction"/>

<form action="${logoutAction}" method="post">
    <input type="submit" value="Logout"/>
</form>

