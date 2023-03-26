package com.basedatos.basededatos.dao;



import com.basedatos.basededatos.models.TransactionModel;

import java.util.List;

public interface TransactionDao {

    List<TransactionModel> getTrAll();
    TransactionModel getTr(long id);
    TransactionModel registerTr(TransactionModel propertyModel);
    TransactionModel updateTr(TransactionModel propertyModel);
    void deleteTr(long id);

}
