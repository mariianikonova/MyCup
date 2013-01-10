import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter {

    public static final String SESSION_ATTR_PASSWORD = "password";
    public static final String SESSION_ATTR_USER = "userId";
    public static final String INIT_PARAM_IGNORE_STARTS_WITH = "ignorePathStartsWith";

    private String ignorePathStartsWith;

    public void init(FilterConfig config) throws ServletException {
        ignorePathStartsWith = config.getInitParameter(INIT_PARAM_IGNORE_STARTS_WITH);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {

        if (request instanceof HttpServletRequest) {
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            String path = ((HttpServletRequest) request).getRequestURI();
            if (session == null) {
                Util.forward(request, response, "/index.jsp");
            } else if (!path.startsWith(ignorePathStartsWith)) {
                String password = (String) session.getAttribute(SESSION_ATTR_PASSWORD);
                String userId = (String) session.getAttribute(SESSION_ATTR_USER);
                if (password != null && userId != null) {
                    Util.forward(request, response, "/targetSource.jsp");
                } else {
                    Util.forward(request, response, "/auth/loginPage.jsp");
                }
            }
        }
        try {
            chain.doFilter(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void destroy() {
    }
}
