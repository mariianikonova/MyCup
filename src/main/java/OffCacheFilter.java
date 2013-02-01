import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class OffCacheFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        Boolean isCommitted5 = response.isCommitted();
        response.setDateHeader("Expires", 0); //prevents caching at the proxy server
        response.setHeader("Cache-Control", "post-check=0, pre-check=0"); //IE Specific
        response.setHeader("Cache-Control", "no-store, max-age=0, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        Boolean isCommitted6 = response.isCommitted();
        ArrayList headers = (ArrayList) response.getHeaderNames();
        chain.doFilter(servletRequest, servletResponse);
    }


    public void destroy() {
    }
}
