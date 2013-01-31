import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.util.ArrayList;

public class OffCacheFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        chain.doFilter(servletRequest, new HttpServletResponseWrapper((HttpServletResponse) response) {
//            public void setHeader(String name, String value) {
//
//                    super.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
//
//            }
//        });
//        Boolean isCommitted = response.isCommitted();
        response.setDateHeader("Expires", 0); //prevents caching at the proxy server
        response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate"); //HTTP 1.1
        response.setHeader("Cache-Control", "post-check=0, pre-check=0"); //IE Specific
        response.setHeader("Pragma", "no-cache"); //HTTP 1.0
        ArrayList list = (ArrayList) response.getHeaderNames();

        chain.doFilter(servletRequest, servletResponse);

    }


    public void destroy() {

    }
}
