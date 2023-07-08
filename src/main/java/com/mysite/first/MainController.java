package com.mysite.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/first")
    @ResponseBody
    public String first() {
        return "안녕하세요 first project에 오신 것을 환영합니다!";
    }
    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}