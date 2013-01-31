import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;

public class AuthFilter implements Filter, CustomSessionAttributes {

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        HttpSession session = createSession(request);
//        Boolean isCommitted2 = response.isCommitted();
//        ArrayList list2 = (ArrayList) ((HttpServletResponse) response).getHeaderNames();
        if (isAuthenticated(request)) {
            chain.doFilter(request, response);
        } else {
            String path = ((HttpServletRequest) request).getRequestURI();
            session.setAttribute(SESSION_ATTR_USER_PATH, path);

            Util.forward(request, response, "/auth/loginPage.jsp");

//            Boolean isCommitted4 = response.isCommitted();
//            ArrayList list4 = (ArrayList) ((HttpServletResponse) response).getHeaderNames();
        }
//        Boolean isCommitted3 = response.isCommitted();
//        ArrayList list3 = (ArrayList) ((HttpServletResponse) response).getHeaderNames();
    }

    public void destroy() {
    }

    private HttpSession createSession(ServletRequest request) throws java.io.IOException, ServletException {
        HttpSession session = null;
        if (request instanceof HttpServletRequest) {
            session = ((HttpServletRequest) request).getSession();
        }
        return session;
    }

    private boolean isAuthenticated(ServletRequest request) throws java.io.IOException, ServletException {
        if (request instanceof HttpServletRequest) {
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            if (session != null) {
                User user = (User) session.getAttribute(SESSION_ATTR_AUTH_USER);
                if (user != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
