package com.lotto.gamble.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    //http://localhost:8080/swagger-ui/index.html
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(info());
	}
	
	private Info info() {
		return new Info()
				.title("Lotto Machine API")
				.description("Lotto REST API 문서입니다.")
				.version("0.1.0");
	}
}
