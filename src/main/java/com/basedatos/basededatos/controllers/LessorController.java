package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.LessorsModel;
import com.basedatos.basededatos.services.LessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/lessor") // Arrendador
public class LessorController {

    @Autowired
    LessorService lessorService;

    @GetMapping("/getAll")
    List<LessorsModel> getAllUser(){
        return lessorService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    LessorsModel getUserById(@PathVariable("id") long id ){
        return lessorService.get(id);
    }

    @PostMapping(value = "/create")
    LessorsModel createUser(@RequestBody LessorsModel lessorsModel){
     return lessorService.register(lessorsModel);
    }



    @PutMapping(value = "/update/{id}")
    LessorsModel updateUserById(@RequestBody LessorsModel lessorsModel){
        return lessorService.update(lessorsModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        lessorService.delete(id);
    }
}
