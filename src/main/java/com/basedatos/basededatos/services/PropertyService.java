package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.PropertyDao;
import com.basedatos.basededatos.dao.TenantDao;
import com.basedatos.basededatos.models.PropertyModel;
import com.basedatos.basededatos.models.TenantsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    PropertyDao propertyDao;

    public List<PropertyModel> getAll(){
        return propertyDao.getPAll();
    }

    public PropertyModel get(long id){
        return propertyDao.getP(id);
    }

    public PropertyModel register(PropertyModel tenantsModel){
        return propertyDao.registerP(tenantsModel);
    }

    public PropertyModel update(@RequestBody PropertyModel tenantsModel){
        return propertyDao.updateP(tenantsModel);
    }

    public void delete(@PathVariable long id){
        propertyDao.deleteP(id);
    }
}
