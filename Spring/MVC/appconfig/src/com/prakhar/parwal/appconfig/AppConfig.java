package com.prakhar.parwal.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/views/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
