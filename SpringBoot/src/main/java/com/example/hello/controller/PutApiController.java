package com.example.hello.controller;

import com.example.hello.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/put")
public class PutApiController {

    @PutMapping("/")
    public PutRequestDto put(@RequestBody PutRequestDto requestData) {
        System.out.println(requestData);
        return requestData;
    }

    @PutMapping("/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto requestData, @PathVariable(name = "userId") Long id) {
        System.out.println(id);
        System.out.println(requestData);
        return requestData;
    }
}
