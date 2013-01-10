import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LoginServlet extends HttpServlet {

    public static final String SESSION_ATTR_PASSWORD = "password";
    public static final String SESSION_ATTR_USER = "userId";
    public static final String REQUEST_ATTR_ERRORS = "errors";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter(SESSION_ATTR_USER);
        String password = request.getParameter(SESSION_ATTR_PASSWORD);
        User user = new User();

        try {
            List<String> errors = validate(username, password);
            if (!errors.isEmpty()) {
                request.setAttribute(REQUEST_ATTR_ERRORS, errors);
                Util.forward(request, response, "/auth/loginPage.jsp");
                return;
            } else {
                request.getSession(true).setAttribute(SESSION_ATTR_USER, username.toLowerCase().trim());
                user.setUSER_ATTR_USERNAME(username);
                user.setUSER_ATTR_PASSWORD(password);
                Util.forward(request, response, "/targetSource.jsp");
            }

        } catch (IOException io) {
            System.out.println("IOException raised in LoginHandler");
        }
    }

    private List<String> validate(String username, String password) {
        List<String> errors = new ArrayList<String>();
        if (Util.isNullOrEmpty(username) || Util.isNullOrEmpty(password)) {
            errors.add("Login or Password is empty");
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
