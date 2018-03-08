package com.hh.reactor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/hhHello")
public class HhReactorController {
    @Autowired
    private HhHandle hhService;




//    @RequestMapping(value = "/hii", method = RequestMethod.GET)
//    public Mono<String> hiHh() {
//        return Mono.create(cityMonoSink -> cityMonoSink.success(hhService.helloWorld()));
//    }


}
