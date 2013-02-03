import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.*;


public class AuthFilter implements Filter, CustomSessionAttributes {

    private static final Logger log = LoggerFactory.getLogger(AuthFilter.class.getName());

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        HttpSession session = createSession(request);
        if (isAuthenticated(request)) {
            chain.doFilter(request, response);
            log.info("LOGGER WORKS!!!!");
        } else {
            String path = ((HttpServletRequest) request).getRequestURI();
            session.setAttribute(SESSION_ATTR_USER_PATH, path);
            Util.forward(request, response, "/auth/loginPage.jsp");
        }
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
