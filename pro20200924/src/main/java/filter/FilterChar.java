package filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterChar implements Filter {
    String charset;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        charset=filterConfig.getInitParameter("charset");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(charset);
        servletResponse.setCharacterEncoding(charset);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
