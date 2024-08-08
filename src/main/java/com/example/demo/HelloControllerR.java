package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerR {

    @GetMapping("/hello")
    public String sayHello() {
        return "<html>" +
                "<head><title>Hello Page</title></head>" +
                "<style>" +
                "body {font-family: Arial, sans-serif; margin: 40px; background-color: #f4f4f4;}" +
                "h1 {color: #333;}" +
                "p {font-size: 18px; color: #666;}" +
                "</style>" +
                "<body>" +
                "<h1>Hello,</h1>" +
                "<p>This is a simple HTML response!.</p>" +
                "</body>" +
                "</html>";
    }
}
