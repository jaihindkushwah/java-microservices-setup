package com.ecomproj.LoginService.LoginService.controller;

import com.ecomproj.LoginService.LoginService.dto.TodoCreate;
import com.ecomproj.LoginService.LoginService.entity.UserEntity;
import com.ecomproj.LoginService.LoginService.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@Controller
@RestController
@RequestMapping("/auth")

public class AuthController {

    @Autowired
    UserService user;
    @GetMapping("/")
    public List<UserEntity> authTest(){
        return  user.getUserData();
    }
    @PostMapping(value = "/hi",consumes = "application/json")
    public ResponseEntity<String> getHi(){
        return   new ResponseEntity<>("Resource created successfully", HttpStatus.CREATED);
    }
    @PostMapping(value = "/create",consumes = "application/json")
    public String todoCreate( @Valid @RequestBody TodoCreate request){
        if(Objects.isNull(request)){
            return "Please enter request";
        }
        return user.createTodo(request);
    }
    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        return user.deleteAllTodo();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOne(@PathVariable("id") String id){
        System.out.println("____id__ "+id);
        return  null;
    }
}
