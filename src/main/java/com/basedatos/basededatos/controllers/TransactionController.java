package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.PropertyModel;
import com.basedatos.basededatos.models.TransactionModel;
import com.basedatos.basededatos.services.PropertyService;
import com.basedatos.basededatos.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/getAll")
    List<TransactionModel> getAllProfile(){
        return transactionService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    TransactionModel getUserById(@PathVariable("id") long id ){
        return transactionService.get(id);
    }

    @PostMapping(value = "/create")
    TransactionModel createUser(@RequestBody TransactionModel transactionModel){
        return transactionService.register(transactionModel);
    }

    @PutMapping(value = "/update/{id}")
    TransactionModel updateUserById(@RequestBody TransactionModel transactionModel){
        return transactionService.update(transactionModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        transactionService.delete(id);
    }
}
