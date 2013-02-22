<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="title">
        <title>
            First target page
        </title>
    </tiles:putAttribute>

    <tiles:putAttribute name="content">
        Welcome to Your source!
        <c:url var="targetUrl" value="/app/targetSourceNext"/>
        <a href="${targetUrl}">Your NEXT Page</a>
        <c:url var="logoutAction" value="/app/j_spring_security_logout"/>
        <form action="${logoutAction}" method="post">
            <input type="submit" value="Logout" id="submit"/>
        </form>
    </tiles:putAttribute>
</tiles:insertDefinition>
