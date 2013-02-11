 package auth;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import utils.*;


 public class LogoutServlet extends HttpServlet implements CustomSessionAttributes {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute(CustomSessionAttributes.SESSION_ATTR_AUTH_USER);

        Util.forward(request, response, "/view/auth/loginPage.jsp");
    }
}

