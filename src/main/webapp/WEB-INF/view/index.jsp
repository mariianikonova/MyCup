<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="title">
        <title>
            Second target page
        </title>
    </tiles:putAttribute>
    <tiles:putAttribute name="content">
        <p><c:url var="targetUrl" value="/app/targetSource"/>
            <a href="${targetUrl}">Your Page</a>
        </p>

        <p>
            <c:url var="urlToAuth" value="/app/loginPage"/>
            <a href="${urlToAuth}">Login Page</a>
        </p>
        <c:url var="logoutAction" value="/app/j_spring_security_logout"/>
        <form action="${logoutAction}" method="post">

            <input type="submit" value="Logout" id="submit"/>
        </form>
    </tiles:putAttribute>
</tiles:insertDefinition>