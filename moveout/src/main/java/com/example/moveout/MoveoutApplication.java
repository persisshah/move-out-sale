package com.example.moveout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MoveoutApplication {
	public final String frontEndHost = "http://localhost:3000";
	public static void main(String[] args) {
		SpringApplication.run(MoveoutApplication.class, args);
	}
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/loginApi").allowedOrigins(frontEndHost);
					registry.addMapping("/registerApi").allowedOrigins(frontEndHost);
				}
			};
		}
}
