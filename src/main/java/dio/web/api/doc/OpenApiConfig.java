
package dio.web.api.doc;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springdoc")
                .packagesToScan("dio.web.api.controller")
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Título da API")
                                .description("Descrição detalhada da API")
                                .version("versão da API")
                                .termsOfService("http://termosdeservico.com")
                                .contact(new Contact().name("Nome do Contato")
                                                      .url("http://url-do-contato.com")
                                                      .email("email@contato.com"))
                                .license(new License().name("Nome da Licença")
                                                       .url("http://url-da-licença.com")));
    }
}
