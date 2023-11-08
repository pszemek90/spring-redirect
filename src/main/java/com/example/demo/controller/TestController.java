package com.example.demo.controller;

import com.example.demo.model.SomeBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @PostMapping("/save")
    public ResponseEntity<String> postRedirect(@RequestBody SomeBody body) {
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY).header("Location", "http://localhost:8080/save").build();
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> getFallback(@PathVariable String id) {
        return ResponseEntity.ok("Hello from fallback with id: " + id);
    }
}
