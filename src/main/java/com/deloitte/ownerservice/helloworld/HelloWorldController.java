package com.deloitte.ownerservice.helloworld;

//REST API

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Marcar el controlador
@RestController
public class HelloWorldController {


    // /helloworld

    //@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    @GetMapping(path = "/helloworld") //forma mas limpia
    public String helloWorld(){
        //"Hello world"
        return "Hello world from Spring Web";
    }

    @GetMapping(path = "/helloworldbean") //forma mas limpia
    public HelloWorldBean helloWorldBean(){
        //"Hello world"
        return new HelloWorldBean("Hello world");
    }

    @GetMapping(path = "/helloworld/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("hello world, %s", name));
    }

}
