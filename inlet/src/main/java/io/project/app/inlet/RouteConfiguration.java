package io.project.app.inlet;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author armena
 */
@Configuration
public class RouteConfiguration {

    
    //http://localhost:2019/github/api/v2/github/repos
    @Bean
    public RouteLocator routeToMyOwnGithub(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("um_route", r -> r
                .path("/github/**")
                .filters(f -> f.stripPrefix(1))
                .uri("lb://github/")
                )
                .build();
    }

    // http://localhost:2019/armdev
    @Bean
    public RouteLocator routeToMyProfile(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/armdev")
                .uri("http://github.com:80/armdev"))               
                .build();
    }
    
    
     // http://localhost:2019/
    @Bean
    public RouteLocator routeToGithub(RouteLocatorBuilder builder) {
        return builder.routes()                
                .route(p -> p
                .path("/**")
                .uri("http://github.com:80"))
                .build();
    }
}
