package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.LessorDao;
import com.basedatos.basededatos.models.LessorsModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class LessorDaoImp implements LessorDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<LessorsModel> getAll(){
        String hql = "FROM LessorsModel as u";
        return (List<LessorsModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public LessorsModel get(long id){
        return entityManager.find(LessorsModel.class, id);

    }
    @Transactional
    @Override
    public LessorsModel register(LessorsModel lessorsModel){
        entityManager.merge(lessorsModel);
        return lessorsModel;
    }
    @Transactional
    @Override
    public LessorsModel update(LessorsModel lessorsModel){
        entityManager.merge(lessorsModel);
        return lessorsModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        LessorsModel lessorsModel = get(id);
        entityManager.remove(lessorsModel);
    }
}
