package com.minusexpectations.euclid.config;

import com.minusexpectations.euclid.interceptors.DebugInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This class configures the application MVC.
 */
@Configuration
public class WebConfigurations implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new DebugInterceptor());
    }
}
