<%--import java.io.IOException;--%>
<%--import javax.servlet.ServletException;--%>
<%--import javax.servlet.ServletRequest;--%>
<%--import javax.servlet.ServletResponse;--%>

<%
    String username = request.getParameter("userId");
    String password = request.getParameter("password");
    if (username == null || password == null) {
        out.println("Invalid parameters");
    }

    if (username.toLowerCase().trim().equals("admin") && password.toLowerCase().trim().equals("admin")) {
        out.println("Authentication successful");
    }
    else
    {
        out.println("Authentication failed");
    }
     %>