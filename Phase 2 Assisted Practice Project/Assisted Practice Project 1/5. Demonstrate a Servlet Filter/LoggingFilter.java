package com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

@WebFilter("/LoggingFilter")
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Log information before processing the request
        System.out.println("Request received at " + new Date());

        // Pass the request through the filter chain
        chain.doFilter(request, response);

        // Log information after processing the request
        System.out.println("Response sent at " + new Date());
    }

    @Override
    public void destroy() {
        // Cleanup code, if needed
    }
}
