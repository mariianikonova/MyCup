package auth;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import auth.utils.*;


public class LoginServlet extends HttpServlet implements CustomSessionAttributes {

    public static final String REQUEST_ATTR_ERRORS = "errors";
    public static final String REQUEST_ATTR_USER_ID = "userId";
    public static final String REQUEST_ATTR_PASSWORD = "password";
    public static final String REQUEST_PARAM_USER = "masha";
    public static final String REQUEST_PARAM_PASSWORD = "admin";

    private static final Logger log = LoggerFactory.getLogger(AuthFilter.class.getName());

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter(REQUEST_ATTR_USER_ID);
        String password = request.getParameter(REQUEST_ATTR_PASSWORD);
        List<String> errors = validate(username, password);
        String userPath = (String) request.getSession().getAttribute(CustomSessionAttributes.SESSION_ATTR_USER_PATH);
        log.info("In LoginServlet");

        if (errors.isEmpty()) {
            HttpSession session = request.getSession(false);
            User user = new User(username, password);
            session.setAttribute(CustomSessionAttributes.SESSION_ATTR_AUTH_USER, user);
            log.info("In LoginServlet, sendRedirect to (userPath) ");
            response.sendRedirect(userPath);
        } else {
            request.setAttribute(REQUEST_ATTR_ERRORS, errors);
            log.info("In LoginServlet, forward to (loginPage) ");
            Util.forward(request, response, "/auth/loginPage.jsp");
        }
    }

    private List<String> validate(String username, String password) {
        List<String> errors = new ArrayList<String>();
        if (Util.isNullOrEmpty(username)) {
            errors.add("Login is empty");
        }
        if (Util.isNullOrEmpty(password)) {
            errors.add("Password is empty");
        } else {
            if (!username.toLowerCase().trim().equals(REQUEST_PARAM_USER) || !password.trim().equals(REQUEST_PARAM_PASSWORD)) {
                errors.add("Credentials are invalid");
            }
        }
        return errors;
    }
}
