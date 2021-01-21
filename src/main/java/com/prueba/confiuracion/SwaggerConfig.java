package com.prueba.confiuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * clase en la cual se realiza la configuracion para poder exponer los servicios en Swagger 
 * con la anotacion @Configuration le indicamos a Spring boot que esta clase contiene las configuraciones 
 * con la anotaccion @EnableSwagger2 Indica que se debe habilitar la compatibilidad con Swagger. 
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.prueba.controller"))
				//.paths(PathSelectors.any())
				.build()
				//.apiInfo(getApiInfo())
				;
	}
	
	
}


