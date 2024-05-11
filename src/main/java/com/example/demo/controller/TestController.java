package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/test")
public class TestController {

    @GetMapping("/all")
    public List<String> getAll (){
        return List.of("Ashiq", "Tanvir", "Abeer");
    }

    @GetMapping
    public String get(){
        return "Ashiqur Rahman";
    }

    @PostMapping
    public String post(@RequestBody String name){
        return name;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        return "Deleted id: " + id;
    }


}
