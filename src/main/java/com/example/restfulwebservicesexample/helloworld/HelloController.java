package com.example.restfulwebservicesexample.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

  /*  @RequestMapping(method= RequestMethod.GET, path="/helloworld")
    public String helloWorld() {
        return "hellooocanım:D";
    }*/

    @GetMapping(path = "/helloworld")
    public String helloWorld() {
        return "hellooocanım:D";
    }

    @GetMapping(path = "/helloworldBean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello world bean");
    }

    @GetMapping(path = "/helloworld/path/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        //    throw new RuntimeException("Something wrong");
       return new HelloWorldBean("Hello world" + name);
    }
}
