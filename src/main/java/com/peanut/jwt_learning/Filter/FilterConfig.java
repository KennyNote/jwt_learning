package com.peanut.jwt_learning.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author Kenny Liu
 * @version 2019-12-20
 **/
@Configuration
public class FilterConfig {

    @Bean
    public Filter authFilter(){
        return new AuthFilter();
    }

    @Bean
    public FilterRegistrationBean authFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(authFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
