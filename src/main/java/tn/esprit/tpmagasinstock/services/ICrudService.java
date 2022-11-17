package tn.esprit.tpmagasinstock.services;

import java.util.List;

public interface ICrudService<Class,TypeId>  {
    List<Class> getAll();
    Class add(Class class1);
    Class update(Class class1, TypeId id);
    void delete(TypeId id);
}
