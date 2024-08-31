package lk.ijse.gdse.aad67.introwithspringwebmvc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("map")
public class Mapping {
    @GetMapping("hello??")
    public String helloMappingPart1(){
        return "Hello Mapping";
    }
    @GetMapping("test/**")
    public String helloMappingPart2(){
        return "Hello Mapping with **";
    }
    @PostMapping("/{name}/{value}")
    public String helloMappingPart3(@PathVariable ("name") String myname,@PathVariable ("value") int value){
        return "Path variables are "+myname+ " and "+value;
    }
    @PostMapping("/{id:S\\d{4}}")
    public String helloMappingPart4(@PathVariable("id") String id){
        return "Pattern accepted path variable is "+id;
    }
}
