<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<html>
<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
<head>
    <title>Auth Error</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <style type="text/css">
        .rightSection {
          background-color: #E6E6FA;
          float:left;
          padding: 20px;
          height:90%;
          width:50%
        }
    </style>
</head>
<body>
<c:url var="pathToLoginPage" value="/loginPage.jsp"/>
<p><a href="${pathToLoginPage}">Authorization failed. Please,try again.</a></p>
</body>
</html>