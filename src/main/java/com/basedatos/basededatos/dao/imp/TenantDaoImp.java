package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.TenantDao;
import com.basedatos.basededatos.models.TenantsModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TenantDaoImp implements TenantDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<TenantsModel> getTAll(){
        String hql = "FROM TenantsModel as u";
        return (List<TenantsModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public TenantsModel getT(long id){
        return entityManager.find(TenantsModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public TenantsModel registerT(TenantsModel tenantsModel){
        entityManager.merge(tenantsModel); // TODO: merge => INSERT
        return tenantsModel;
    }
    @Transactional
    @Override
    public TenantsModel updateT(TenantsModel tenantsModel){
        entityManager.merge(tenantsModel);
        return tenantsModel;
    }
    @Transactional
    @Override
    public void deleteT(  long id){
        TenantsModel tenantsModel = getT(id);
        entityManager.remove(tenantsModel); // TODO: remove(modelo) => delete
    }
}
