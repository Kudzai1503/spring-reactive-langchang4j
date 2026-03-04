package com.dambex.langchangflux.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI claimsOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Claims AI API")
                        .description("Upload medical claims CSV and query AI for explanations or summaries")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Kudzai Damba")
                                .email("damba@gmail.com")
                        )
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")
                        )
                );
    }
}
