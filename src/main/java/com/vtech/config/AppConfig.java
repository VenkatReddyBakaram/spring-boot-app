package com.vtech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vtech.components.BeanComponent;

@Configuration
public class AppConfig {

	@Bean
	BeanComponent getBeanComponent() {
		return new BeanComponent();
	}
}
