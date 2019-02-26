package org.sbelei.restsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverallErrorController implements ErrorController{

    Logger log = LoggerFactory.getLogger(OverallErrorController.class);

    @GetMapping("/error")
    String error() {
        log.error("something went wrong");
        return "something went wrong";
    }

    @Override
    public String getErrorPath() {
        //TODO SB : Seems like a bug
        return "/you_can_put_whatever_here";
    }
}
