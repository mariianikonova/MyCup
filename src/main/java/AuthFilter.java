import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter, CustomSessionAttributes {

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {

        if (request instanceof HttpServletRequest) {
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            if (session != null) {
                User user = (User) session.getAttribute("newUser");
                if (user != null) {
                    Util.forward(request, response, "/userTargets/targetSource.jsp");
                } else {
                    Util.forward(request, response, "/auth/loginPage.jsp");
                }
            } else {
                Util.forward(request, response, "/index.jsp");
            }
        }
        chain.doFilter(request, response);
    }


    public void destroy() {
    }
}
