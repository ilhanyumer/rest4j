package software.deve.rest4j;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Rest4JApplication {

    public static void main(String[] args) {
        SpringApplication.run(Rest4JApplication.class, args);
    }

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Contacts API")
                        .description("Sample contacts API")
                        .version("v0.0.1")
                        .license(new License().name("All rights reserved").url("https://example.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Example Documentation")
                        .url("https://example.com"));
    }

}
