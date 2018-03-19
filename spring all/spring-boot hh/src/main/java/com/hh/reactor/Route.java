package com.hh.reactor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Route {
    //    @Autowired
//    private CityService cityService;
    @Autowired
    private HhHandle hhHandle;
//    public Routes(CityService cityService) {
//        this.cityService = cityService;
//    }



    @Bean
    public RouterFunction<?> routerFunction() {
        return route(
                GET("/hhHello/hii").and(accept(MediaType.APPLICATION_JSON)), hhHandle::helloWorld).
                andRoute(GET("/hhHello/hiii/{cd}").and(accept(MediaType.APPLICATION_JSON)), hhHandle::hhString);
    }
}