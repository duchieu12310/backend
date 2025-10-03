package vn.dh.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.dh.jobhunter.util.error.IdInvalidException;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getHelloWorld() throws IdInvalidException {
        return "Hello World (adsadasdas)";
    }
}
