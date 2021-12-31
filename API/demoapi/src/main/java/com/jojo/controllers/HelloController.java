package com.jojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.PostMapping;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/welcome")
public class HelloController {
    
    @GetMapping
    public String welcome(){
        return "Hello Jojo semangat yaa...";

    }


}
