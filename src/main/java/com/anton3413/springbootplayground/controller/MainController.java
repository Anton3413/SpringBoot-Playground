package com.anton3413.springbootplayground.controller;


import com.anton3413.springbootplayground.model.Company;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    /*@GetMapping("hello/{id}")
        public String getMainPage(@RequestParam Integer age,
                                    @CookieValue(value = "JSESSIONID",required = false) String jsessionId,
                                    @PathVariable Integer id,
                                    @RequestHeader("Accept") String type){

        System.out.println(age);
        System.out.println(jsessionId);
        System.out.println(id);
        System.out.println(type);
        return "index";
    }*/

    @GetMapping("hello")
    public String getPage(Model model){
        model.addAttribute("company",new Company(5,"Google"));
        return "index";
    }



    @GetMapping("bye")
    public String getMainPage2(){
       return "index";
    }
}
