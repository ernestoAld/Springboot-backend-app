package com.ernesto.mito6.service.impl;

import com.ernesto.mito6.repositories.IGenericRepo;
import com.ernesto.mito6.service.ICRUD;

import java.util.List;
//Aqui usamos los metodos de la interfaz ICRUD y les definimos su funcion
public abstract class CRUDImpl<T,ID> implements ICRUD<T,ID> {

    protected abstract IGenericRepo<T,ID> getRepo(); //metodo que retornará un repositorio del tipo indicado

    @Override
    public T save(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public T update(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public List<T> readAll() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T readById(ID id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void deleteById(ID id) throws Exception {
        getRepo().deleteById(id);
    }

}
