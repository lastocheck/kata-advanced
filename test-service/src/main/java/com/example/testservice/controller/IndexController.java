package com.example.testservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Value ("${hello}") String hello;

    @GetMapping(value = "/")
    @ResponseBody
    String index(Model model) {
        return hello;
    }
}
