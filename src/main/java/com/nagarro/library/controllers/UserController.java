package com.nagarro.library.controllers;

import com.nagarro.library.models.Librarian;
import com.nagarro.library.payloads.UserPayload;
import com.nagarro.library.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public ResponseEntity<Librarian> login(@RequestBody UserPayload userPayload){
        System.out.println(userPayload.toString());
        try{
            Librarian librarian = userService.getUserByUsername(userPayload.getUsername());
            // matching password
            if(librarian.getPassword().equals(userPayload.getPassword())){
                return new ResponseEntity(librarian, HttpStatus.OK);
            }else{
                return new ResponseEntity(HttpStatus.UNAUTHORIZED);
            }
        }catch (NullPointerException e){
           return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
