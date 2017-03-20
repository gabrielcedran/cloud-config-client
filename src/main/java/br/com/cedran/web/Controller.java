package br.com.cedran.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${message:Hello default!}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
