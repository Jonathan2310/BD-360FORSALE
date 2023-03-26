package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.LessorsModel;
import com.basedatos.basededatos.models.TenantsModel;
import com.basedatos.basededatos.services.LessorService;
import com.basedatos.basededatos.services.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tenant")
public class TenantController {
    @Autowired
    TenantService tenantService;

    @GetMapping("/getAll")
    List<TenantsModel> getAllProfile(){
        return tenantService.getAll();
    }

    @PostMapping(value = "/create")
    TenantsModel createUser(@RequestBody TenantsModel tenantsModel){
        return tenantService.register(tenantsModel);
    }

    @GetMapping(value = "/getId/{id}")
    TenantsModel getUserById(@PathVariable("id") long id ){
        return tenantService.get(id);
    }

    @PutMapping(value = "/update/{id}")
    TenantsModel updateUserById(@RequestBody TenantsModel tenantsModel){
        return tenantService.update(tenantsModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        tenantService.delete(id);
    }
}
