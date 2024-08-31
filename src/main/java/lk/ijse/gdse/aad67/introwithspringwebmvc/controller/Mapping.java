package lk.ijse.gdse.aad67.introwithspringwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping("map")
public class Mapping {
    @GetMapping("hello?")
    public String helloMapping(){
        return "Hello Mapping";
    }
}
