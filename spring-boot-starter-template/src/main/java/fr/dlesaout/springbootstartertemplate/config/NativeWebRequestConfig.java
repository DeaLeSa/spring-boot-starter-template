package fr.dlesaout.springbootstartertemplate.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;

@Configuration
public class NativeWebRequestConfig {

    @Bean
    @Primary
    public NativeWebRequest nativeWebRequest(HttpServletRequest request) {
        return new ServletWebRequest(request);
    }
}
