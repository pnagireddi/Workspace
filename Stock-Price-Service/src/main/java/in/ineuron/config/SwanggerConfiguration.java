package in.ineuron.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwanggerConfiguration {
	
	@Bean
	public Docket createDocket() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("in.ineuron.controller"))
				.paths(PathSelectors.regex("/stock.*")).build().useDefaultResponseMessages(true).apiInfo(getApiInfo());
	}
	
	public static ApiInfo getApiInfo() {
		Contact contact = new Contact("nagireddy", "http://www.ineuron.ai/course", "pnagireddy444@gmail.com");
	return	new ApiInfo("Stock Price Info", "Gives information about the Stock Price based on Company Name", "3.4.RELEASE",
				"http:www.hcl.com/license", contact, "GNU PUBLIC", "http://apache.org/license/guru",
				Collections.emptyList());
	}

}
