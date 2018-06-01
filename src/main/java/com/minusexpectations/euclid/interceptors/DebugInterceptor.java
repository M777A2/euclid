package com.minusexpectations.euclid.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * An interceptor for logging requests and responses. Intended only for active debugging.
 */
public class DebugInterceptor extends HandlerInterceptorAdapter
{
    private static Logger log = LoggerFactory.getLogger(DebugInterceptor.class);

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler)
            throws Exception
    {
        log.trace("Received {} request for URI: {}", request.getMethod(), request.getRequestURI());
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            ModelAndView modelAndView)
            throws Exception
    {
        int status = response.getStatus() / 100;


        if (status != 2)
        {
            log.debug("{} request to url \"{}\" failed with status {}",
                    request.getMethod(),
                    request.getRequestURI(),
                    response.getStatus());
        }

        super.postHandle(request, response, handler, modelAndView);
    }
}
