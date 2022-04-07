package org.claz.learning.webservice;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public Map<String, String> message(){
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello world!");
        return message;
    }
}
