package lk.ijse.gdse.aad67.introwithspringwebmvc.controller;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class Demo {
    @GetMapping
    public String healthTest( ) {
        return "Hello Demo";
    }
    @GetMapping("other")
    public String otherGet(){
        return "Other Get";
    }
    @PostMapping
    public String healthTestPost( ) {
        return "Hello Demo Post";
    }
}
