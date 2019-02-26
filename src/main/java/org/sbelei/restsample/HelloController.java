package org.sbelei.restsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    String sayHello() {
        log.info("Hello world");
        return "Hello world";
    }

}
