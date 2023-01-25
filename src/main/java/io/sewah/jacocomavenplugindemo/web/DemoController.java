package io.sewah.jacocomavenplugindemo.web;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    public String greet(String name){
        StringBuilder sb = new StringBuilder();
        if(name.equals("") || name.trim().length() == 0){
            sb.append("Name is not specified!");
        } else {
            sb.append("Hello ").append(name).append("!");
        }

        return sb.toString();
    }
}
