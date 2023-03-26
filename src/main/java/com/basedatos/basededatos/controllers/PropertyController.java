package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.PropertyModel;
import com.basedatos.basededatos.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/property")
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    @GetMapping("/getAll")
    List<PropertyModel> getAllProfile(){
        return propertyService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    PropertyModel getUserById(@PathVariable("id") long id ){
        return propertyService.get(id);
    }

    @PostMapping(value = "/create")
    PropertyModel createUser(@RequestBody PropertyModel propertyModel){
        return propertyService.register(propertyModel);
    }

    @PutMapping(value = "/update/{id}")
    PropertyModel updateUserById(@RequestBody PropertyModel propertyModel){
        return propertyService.update(propertyModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        propertyService.delete(id);
    }
}
