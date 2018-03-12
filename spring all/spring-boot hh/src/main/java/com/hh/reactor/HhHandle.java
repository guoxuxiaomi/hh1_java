package com.hh.reactor;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class HhHandle {

    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("hello hh"));

    }


    public Mono<ServerResponse> hhString(ServerRequest request) {
        List<String> l = Arrays.asList("1", "2", "3");
        Optional id = request.attribute("id");
        Optional cd = request.attribute("cd");
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(l));
    }
}
