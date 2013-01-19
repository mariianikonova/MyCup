import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LogoutServlet extends HttpServlet implements CustomSessionAttributes {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("password");
        request.getSession().removeAttribute("userId");
        request.getSession().removeAttribute("newUser");
        Util.forward(request, response, "/auth/loginPage.jsp");
    }
}

