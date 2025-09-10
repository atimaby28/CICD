package org.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/sample")
    public ResponseEntity sample() {
        return ResponseEntity.ok("테스트1");
    }

    @GetMapping("/health")
    public String health(){
        return "ok";
    }
}
