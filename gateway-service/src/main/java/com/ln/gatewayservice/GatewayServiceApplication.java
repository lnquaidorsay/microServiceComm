package com.ln.gatewayservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author lelo.nyaka
 */
@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	/*@Bean
	RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(r->r.path("/customers/**").uri("http://localhost:8081/"))
				.route(r->r.path("/products/**").uri("http://localhost:8083/"))
				.build();
	}*/

	@Bean
	DiscoveryClientRouteDefinitionLocator dynamciRoutes(ReactiveDiscoveryClient reactiveDiscoveryClient,
														DiscoveryLocatorProperties dlp) {
    return new DiscoveryClientRouteDefinitionLocator(reactiveDiscoveryClient,dlp);
	}

}
