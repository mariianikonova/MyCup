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
        String username = request.getParameter("userId");
        String password = request.getParameter("password");
        List<String> errors = validate(username, password);

        String userPath = (String) request.getSession().getAttribute(SESSION_ATTR_USER_PATH);
        response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");

        if (errors.isEmpty()) {
            HttpSession session = request.getSession(false);
            User user = new User(username, password);
            session.setAttribute(SESSION_ATTR_AUTH_USER, user);
            Util.forward(request, response, userPath);

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
            if (!username.toLowerCase().trim().equals("masha") || !password.trim().equals("admin")) {
                errors.add("Credentials are invalid");
            }
        }
        return errors;
    }
}
