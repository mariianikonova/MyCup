package auth;

import javax.servlet.*;
import javax.servlet.http.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import auth.utils.*;


public class AuthFilter implements Filter, CustomSessionAttributes {

    private static final Logger log = LoggerFactory.getLogger(AuthFilter.class.getName());

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        HttpSession session = createSession(request);
        if (isAuthenticated(session)) {
            chain.doFilter(request, response);
            log.info("AuthFilter WORKS1!!!!");
        } else {
            String path = ((HttpServletRequest) request).getRequestURI();
            session.setAttribute(CustomSessionAttributes.SESSION_ATTR_USER_PATH, path);
            log.info("AuthFilter WORKS2!!!!");
            Util.forward(request, response, "/view/auth/loginPage.jsp");
        }
    }

    public void destroy() {
    }

    private HttpSession createSession(ServletRequest request) throws java.io.IOException, ServletException {
        HttpSession session = null;
        if (request instanceof HttpServletRequest) {
            session = ((HttpServletRequest) request).getSession(true);
        }
        return session;
    }

    private boolean isAuthenticated(HttpSession session) throws java.io.IOException, ServletException {
        if (session != null) {
            User user = (User) session.getAttribute(CustomSessionAttributes.SESSION_ATTR_AUTH_USER);
            if (user != null) {
                return true;
            }
        }
        return false;
    }
}
