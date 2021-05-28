package com.example.personal.controller;

import com.example.personal.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  // デフォルト仮面
  @RequestMapping("/")
  public String index() {
    return "index";
  }
  
  // GETメソッド
  @GetMapping("/form")
  private String readForm(@ModelAttribute User user) {
    return "form";
  }

  // POSTメソッド
  @PostMapping("/form")
  private String confirm(@ModelAttribute User user) {
    return "confirm";
  }
}
