//package info.jab.microservices;
package com.example.demo;

import javax.validation.Valid;
import java.util.List;
//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




@Controller
public class MainController {

//    @GetMapping("/status")
//    public String hello(){
//        return "Hello World!";
//    }

//    @GetMapping("/")
//    public String showForm(Users user) {
//        return "form";
//    }

    @PostMapping(
            path = "/comprobacion",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> checkPersonInfo(@Valid @RequestBody Users2 user,
                                  BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getErrorCount());
            System.out.println("binding result has erros");
            return new ResponseEntity<>("{\"result\" : \"KO: BAD REQUEST\"}", HttpStatus.BAD_REQUEST);
        }

        if ((user.name().equals("Victor")) &&
                (user.lastName().equals("Ovejero")))
                {
            return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
        }
        return new ResponseEntity<>("{\"result\" : \"KO: UNAUTHORIZED\"}", HttpStatus.UNAUTHORIZED);
        //return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);

    }






}