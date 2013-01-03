<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mainSource</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <style type="text/css">
        .rightSection
        {background-color: #E6E6FA; float:left; padding: 20px; height:90%; width:50%}
    </style>


</head>
<body>
<c:url var="url" value="/index.jsp"/>
<p><a href="${url}">Try again.</a></p>
</body>
</html>