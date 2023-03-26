package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.TransactionDao;
import com.basedatos.basededatos.models.TransactionModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TransactionDaoImp implements TransactionDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<TransactionModel> getTrAll(){
        String hql = "FROM TransactionModel as u";
        return (List<TransactionModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public TransactionModel getTr(long id){
        return entityManager.find(TransactionModel.class, id);  // TODO: find -> Select * from where id = id (Modelo, id)
    }

    @Transactional
    @Override
    public TransactionModel registerTr(TransactionModel transactionModel){
        entityManager.merge(transactionModel);  // TODO: merge => INSERT
        return transactionModel;
    }
    @Transactional
    @Override
    public TransactionModel updateTr(TransactionModel transactionModel){
        entityManager.merge(transactionModel);
        return transactionModel;
    }
    @Transactional
    @Override
    public void deleteTr(long id){
        TransactionModel transactionModel = getTr(id);
        entityManager.remove(transactionModel);  // TODO: remove(modelo) => delete
    }
}
