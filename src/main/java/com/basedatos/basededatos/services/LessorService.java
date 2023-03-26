package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.LessorDao;
import com.basedatos.basededatos.models.LessorsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class LessorService {

    @Autowired
    LessorDao lessorDao;

    public List<LessorsModel> getAll(){
        return lessorDao.getAll();
    }

    public LessorsModel get(long id){
        return lessorDao.get(id);
    }

    public LessorsModel register(LessorsModel lessorsModel){
        return lessorDao.register(lessorsModel);
    }

    public LessorsModel update(@RequestBody LessorsModel lessorsModel){
          return lessorDao.update(lessorsModel);
    }

    public void delete(@PathVariable long id){
          lessorDao.delete(id);
    }

}
