import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter  {

    public static final String SESSION_ATTR_PASSWORD = "password";
    public static final String SESSION_ATTR_USER = "userId";

    public void  init(FilterConfig config) throws ServletException{
    }

    public void  doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
          if (request instanceof HttpServletRequest) {
             HttpSession session = ((HttpServletRequest)request).getSession();
                if (session != null) {
                    String password = (String) session.getAttribute(SESSION_ATTR_PASSWORD);
                    String userId = (String) session.getAttribute(SESSION_ATTR_USER);
                    if ((password != null) && (userId != null)) {
                    httpResponse.sendRedirect("targetSource.jsp");
                    }
                }
                else {httpResponse.sendRedirect("loginPage.jsp");
                }
          }
        }

    public void destroy( ){
    }
}
