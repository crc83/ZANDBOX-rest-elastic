package org.sbelei.restsample;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverallErrorController implements ErrorController{

    @GetMapping("/error")
    String error() {
        return "something went wrong";
    }

    @Override
    public String getErrorPath() {
        //TODO SB : Seems like a bug
        return "/you_can_put_whatever_here";
    }
}
