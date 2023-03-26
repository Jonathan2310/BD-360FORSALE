package com.basedatos.basededatos.dao;



import com.basedatos.basededatos.models.PropertyModel;

import java.util.List;

public interface PropertyDao {

    List<PropertyModel> getPAll();
    PropertyModel getP(long id);
    PropertyModel registerP(PropertyModel propertyModel);
    PropertyModel updateP(PropertyModel propertyModel);
    void deleteP(long id);

}
