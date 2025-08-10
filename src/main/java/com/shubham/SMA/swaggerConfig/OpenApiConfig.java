
package com.shubham.SMA.swaggerConfig;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenApiCustomizer ignoreExceptionParameters() {
		return openApi -> {
			if (openApi.getComponents() != null && openApi.getComponents().getSchemas() != null) {
				openApi.getComponents().getSchemas().remove("MethodArgumentNotValidException");
				openApi.getComponents().getSchemas().remove("Exception");
			}
		};
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(
				new Info().title("Student Management API").version("1.0").description("API docs for Student Management")
						.contact(new Contact().name("Shubham Kulkarni").email("shubhamkulkarni41298@gmail.com")));
	}
}
