package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Cart Checkout Service")
                                .description("Microservice for managing shopping carts and the checkout handoff. Supports cart creation, line-item mutation, coupon application, and totals calculation. ")
                                .contact(
                                        new Contact()
                                                .name("Storefront Team")
                                                .email("cart@example.com")
                                )
                                .version("1.0.0")
                )
        ;
    }
}
