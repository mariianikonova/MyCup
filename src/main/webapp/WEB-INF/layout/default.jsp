<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <link rel="stylesheet" href="/css/style.css" type="text/css"/>
    <title>
        <tiles:getAsString name="title"/>
    </title>
</head>
<body>
<div class="mainSection">
    <tiles:insertAttribute name="content"/>
</div>
</body>
</html>

