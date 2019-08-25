package com.ssm.demo.common;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: ssm-demo
 * @description:
 * @author: Leiah1998
 * @create: 2019-08-09 10:11
 **/
public class CrossOriginesourceSharingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST,OPTIONS,PUT,GET,DELETE");
        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, token");
        response.addHeader("Access-Control-Max-Age", "60");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
