package br.univille.novostalentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
   // @ResponseBody
    public String index(){
      //  return "eu não acredito...java lindo";
      return "home/index";
    }
}
