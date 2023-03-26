package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.TransactionDao;
import com.basedatos.basededatos.models.TransactionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionDao transactionDao;

    public List<TransactionModel> getAll(){
        return transactionDao.getTrAll();
    }

    public TransactionModel get(long id){
        return transactionDao.getTr(id);
    }

    public TransactionModel register(TransactionModel tenantsModel){
        return transactionDao.registerTr(tenantsModel);
    }

    public TransactionModel update(@RequestBody TransactionModel tenantsModel){
        return transactionDao.updateTr(tenantsModel);
    }

    public void delete(@PathVariable long id){
        transactionDao.deleteTr(id);
    }
}
