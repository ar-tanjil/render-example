package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/test")
@RequiredArgsConstructor
public class TestController {

    private final EmployeeRepo repo;


    @GetMapping("getAll")
    public List<Employee> getAll(){
        return repo.findAll();
    }

    @GetMapping
    public String get(){
        return "Ashiqur Rahman";
    }

    @PostMapping
    public String post(@RequestBody String name ){
        Employee emp = new Employee();
        emp.setName(name);
        repo.save(emp);
        return "Success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        return "Deleted id: " + id;
    }


}
