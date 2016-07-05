package com.jackietreehornpublishing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by russellmiles on 05/07/2016.
 */
@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String home() {
        return "Hello Microservice World";
    }
}
