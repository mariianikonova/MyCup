import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public static final String SESSION_ATTR_PASSWORD = "password";
    public static final String SESSION_ATTR_USER = "userId";
    public static final String RESPONSE_CONTENT_TYPE = "text/html";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter(SESSION_ATTR_USER);
    String password = request.getParameter(SESSION_ATTR_PASSWORD);
    String emptyString = "";
    ServletOutputStream out = response.getOutputStream();
    response.setContentType(RESPONSE_CONTENT_TYPE);

     try {
        if (username.equals(emptyString) && password.equals(emptyString)) {
            response.sendRedirect("errorPage.jsp");
        }
        String usernameCleared = username.toLowerCase().trim();
        String passwordCleared = password.trim();
        if (usernameCleared.equals("masha") && passwordCleared.equals("admin")) {
            request.getSession(true).setAttribute(SESSION_ATTR_USER, usernameCleared);
            request.getSession(true).setAttribute(SESSION_ATTR_PASSWORD, passwordCleared);
            response.sendRedirect("targetSource.jsp");
            }
        else {
           out.println ("<html> Please, fill another credentials and try again. User with this credentials doesn`t exist <p> <a href=\"/loginPage.jsp\"> Use another credentials </a> </html>");
        }
    }
    catch (IOException io) { System.out.println("IOException raised in LoginHandler");
    }
    }
}
