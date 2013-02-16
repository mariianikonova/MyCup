<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <%--<c:url var="cssUrl" context="/app" value="/style.css"/>--%>
    <%--<link rel="stylesheet" href="${cssUrl}" type="text/css"/>--%>
        <%--<link rel="stylesheet" href="/css/style.css" type="text/css"/>--%>

        <title>
        <tiles:getAsString name="title"/>
    </title>
    <c:url var="cssUrl" context="/app" value="/style.css"/>
    <link rel="stylesheet" href="${cssUrl}" type="text/css"/>
        <%--<link rel="stylesheet" href="/assets/css/style.css" type="text/css"/>--%>
</head>
<body>
<div class="mainSection">
    <tiles:insertAttribute name="content"/>
</div>
</body>
</html>

