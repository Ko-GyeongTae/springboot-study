package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello")
    public String hello(){
        return "get hello";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : " + name);

        return name;
    }

    @GetMapping("/path-variable1/{name}")
    public String pathVariable1(@PathVariable(name = "name") String testName){
        System.out.println("PathVariable : " + testName);

        return testName;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping("/query-param1")
    public String queryParam1(
            @RequestParam String name,
            @RequestParam String email
    ) {
        System.out.println(name);
        System.out.println(email);
        return name + " " + email;
    }

    @GetMapping("/query-param2")
    public String queryParam2(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        return userRequest.toString();
    }
}
