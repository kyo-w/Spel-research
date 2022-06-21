package com.test.controller;

import com.test.repo.CurdRepository;
import com.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private CurdRepository curdRepository;
    @RequestMapping("/getall")
    public List<User> getAll(){
        return curdRepository.findAll();
    }

    @RequestMapping("/get/{id}")
    public List<User> getid(@PathVariable("id") Integer id){
        return curdRepository.getById(id);
    }
    @RequestMapping("/getname/{name}")
    public List<User> getname(@PathVariable String name){
        return curdRepository.getByName(name);
    }
}
