package ru.spiridonov.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-word")
    public String sayHello() {
        return "hello_word";
    }
}
