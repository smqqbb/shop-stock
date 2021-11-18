package asignment.shopstock;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopstockApplication.class, args);
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Shopstock API"))
				.addServersItem(new Server().url("http://shop-stock.herokuapp.com/"));
	}

}
