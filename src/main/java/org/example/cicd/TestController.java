package org.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("sample")
    public String sample(){
        return "sample!!";
    }

    @GetMapping("/health")
    public String health(){
        return "health!!!";
    }
}
