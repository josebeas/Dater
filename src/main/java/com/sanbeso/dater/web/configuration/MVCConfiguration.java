package com.sanbeso.dater.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.sanbeso.dater.web")
@EnableWebMvc
public class MVCConfiguration extends WebMvcConfigurerAdapter {

    /**
     * Gets Spring MVC view resolver
     *
     * @return MVC view resolver
     */
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    /**
     * Define the request mapping handler for spring MVC
     *
     * @return Request mapping handler adapter
     */
    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        final RequestMappingHandlerAdapter requestMappingHandlerAdapter = new RequestMappingHandlerAdapter();
        final MappingJackson2HttpMessageConverter mappingJacksonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        final String[] supportedHttpMethods = {"POST", "GET", "HEAD"};

        requestMappingHandlerAdapter.getMessageConverters().add(0, mappingJacksonHttpMessageConverter);
        requestMappingHandlerAdapter.setSupportedMethods(supportedHttpMethods);

        return requestMappingHandlerAdapter;
    }
}
