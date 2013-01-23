import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LoginServlet extends HttpServlet implements CustomSessionAttributes {

    public static final String REQUEST_ATTR_ERRORS = "errors";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter(SESSION_ATTR_USER_ID);
        String password = request.getParameter(SESSION_ATTR_PASSWORD);
        List<String> errors = validate(username, password);

        if (errors.isEmpty()) {
            HttpSession session = request.getSession(true);
            User user = new User(username, password);
            user.setUserName(username);
            user.setUserPassword(password);
            session.setAttribute(SESSION_ATTR_AUTH_USER, user);
            Util.forward(request, response, "/userTargets/targetSource.jsp");

        } else {
            request.setAttribute(REQUEST_ATTR_ERRORS, errors);
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
            if (!username.toLowerCase().trim().equals("masha")) {
                errors.add("Login is invalid");
            }
            if (!password.trim().equals("admin")) {
                errors.add("Password is invalid");
            }
        }
        return errors;
    }
}
