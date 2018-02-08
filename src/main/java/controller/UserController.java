package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ВАСЯ on 06.02.2018.
 */
@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
