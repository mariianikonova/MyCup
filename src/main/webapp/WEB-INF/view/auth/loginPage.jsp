<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="title">
        <title>
            Login page
        </title>
    </tiles:putAttribute>
    <tiles:putAttribute name="content">
        <h1>Please Log In to Your Account</h1>

        <p>Please use the form below to log in to your account.</p>
        <spring:url var="authAction" value="/app/j_spring_security_check"/>
        <form action="${authAction}" method="post">
            <div> UserId <p/>
                <input type="text" name="j_username" size="24"/> <br/>
            </div>
            <div> Password <p/>
                <input type="password" name="j_password" size="24" minlength="6"/>
                <c:if test="${param.error == 'true'}">
        <span>
        <div class=errors>
            <p/>
            Authentication Failure, please try again!
            <p/>
        </div>
        </span>
                </c:if>
                <div>

                    <input type="submit" name="submitButton" value="Login" id="submit"/>
                </div>
            </div>
            <p/>

        </form>
    </tiles:putAttribute>
</tiles:insertDefinition>

