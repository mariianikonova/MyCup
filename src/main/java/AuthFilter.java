import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter  {
    public void  init(FilterConfig config)
            throws ServletException{

    }

    public void  doFilter (ServletRequest request, ServletResponse response, FilterChain chain)
        throws java.io.IOException, ServletException {

        HttpServletResponse httpResponse = (HttpServletResponse) response;
        try {
            if (request instanceof HttpServletRequest) {
                HttpSession session = ((HttpServletRequest)request).getSession();
                if (session != null) {
                    String password = (String) session.getAttribute("password");
                    String userId = (String) session.getAttribute("userId");
                    if((password != null) && (userId!=null))
                    httpResponse.sendRedirect("mainSource.jsp");
                } else
                httpResponse.sendRedirect("LoginPage.jsp");
            }  }
          catch (IOException io) {
            System.out.println("IOException raised in AuthenticationFilter");
        }
    }
    public void destroy( ){
    }
}
