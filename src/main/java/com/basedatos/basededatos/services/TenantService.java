package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.LessorDao;
import com.basedatos.basededatos.dao.TenantDao;
import com.basedatos.basededatos.models.LessorsModel;
import com.basedatos.basededatos.models.TenantsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TenantService {
    @Autowired
    TenantDao tenantDao;

    public List<TenantsModel> getAll(){
        return tenantDao.getTAll();
    }

    public TenantsModel get(long id){
        return tenantDao.getT(id);
    }

    public TenantsModel register(TenantsModel tenantsModel){
        return tenantDao.registerT(tenantsModel);
    }

    public TenantsModel update(@RequestBody TenantsModel tenantsModel){
        return tenantDao.updateT(tenantsModel);
    }

    public void delete(@PathVariable long id){
        tenantDao.deleteT(id);
    }
}
