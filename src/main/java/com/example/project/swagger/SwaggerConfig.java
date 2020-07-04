package com.example.project.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	 public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/**"))
			.apis(RequestHandlerSelectors.basePackage("com.example.project")).build().apiInfo(metaData());
	    }
	private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "ApI for Client Details",
                "Spring Boot REST API for CLIENT DETAILS",
                "4.0",
                "Free to use",
                new Contact("WomenInTech", "https://womenInTech/about/", "womenInTech@gmail.com"),
               "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
 

}
