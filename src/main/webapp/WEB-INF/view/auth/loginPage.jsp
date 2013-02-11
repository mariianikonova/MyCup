<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<c:url var="action" context="/app" value="/"/>
<form action="${action}" method="post">
    <div> UserId <p/>
        <input type="text" name="userId" size="24"/> <br/>
    </div>
    <div> Password <p/>
        <input type="password" name="password" size="24" minlength="6"/>

        <div>

            <input type="submit" name="submitButton" value="Login"/>
        </div>
    </div>
    <p/>

    <c:if test="${not empty requestScope.errors}">
        <br/>

        <div class="errors">
            <ul>
                <c:forEach items="${requestScope.errors}" var="error">
                    <li>${error}</li>
                </c:forEach>
            </ul>
        </div>
    </c:if>

</form>
