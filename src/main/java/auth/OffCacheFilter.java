package auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class OffCacheFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(AuthFilter.class.getName());
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        response.setDateHeader("Expires", 0); //prevents caching at the proxy server
        response.setHeader("Cache-Control", "post-check=0, pre-check=0"); //IE Specific
        response.setHeader("Cache-Control", "no-store, max-age=0, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        log.info("OffCacheFilter WORKS!!!!");
        chain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
    }
}
