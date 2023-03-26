package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.LessorsModel;


import java.util.List;


public interface LessorDao {

      List<LessorsModel> getAll();
      LessorsModel get(long id);
      LessorsModel register(LessorsModel lessorsModel);
      LessorsModel update(LessorsModel lessorsModel);
      void delete(  long id);

}
