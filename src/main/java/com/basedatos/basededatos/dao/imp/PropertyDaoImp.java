package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.PropertyDao;
import com.basedatos.basededatos.models.PropertyModel;
import com.basedatos.basededatos.models.TenantsModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PropertyDaoImp implements PropertyDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<PropertyModel> getPAll(){
        String hql = "FROM PropertyModel as u";
        return (List<PropertyModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public PropertyModel getP(long id){
        return entityManager.find(PropertyModel.class, id);  // TODO: find -> Select * from where id = id (Modelo, id)
    }

    @Transactional
    @Override
    public PropertyModel registerP(PropertyModel propertyModel){
        entityManager.merge(propertyModel);  // TODO: merge => INSERT
        return propertyModel;
    }
    @Transactional
    @Override
    public PropertyModel updateP(PropertyModel propertyModel){
        entityManager.merge(propertyModel);
        return propertyModel;
    }
    @Transactional
    @Override
    public void deleteP(long id){
        PropertyModel propertyModel = getP(id);
        entityManager.remove(propertyModel);  // TODO: remove(modelo) => delete
    }
}
