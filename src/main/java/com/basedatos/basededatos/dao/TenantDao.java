package com.basedatos.basededatos.dao;



import com.basedatos.basededatos.models.TenantsModel;

import java.util.List;

public interface TenantDao {

    List<TenantsModel> getTAll();
    TenantsModel getT(long id);
    TenantsModel registerT(TenantsModel tenantsModel);
    TenantsModel updateT(TenantsModel tenantsModel);
    void deleteT(  long id);

}
