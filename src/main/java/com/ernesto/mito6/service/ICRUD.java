package com.ernesto.mito6.service;

import java.util.List;

//Esta interfaz nos indica los metodos que vamos a
// utilizar en todas las clases o interfaces que haganuso de ella
//Nos indica que metodos pero no su funcion
public interface ICRUD <T,ID>{

    T save(T t) throws Exception;
    T update(T t) throws Exception;
    List<T> readAll() throws Exception;
    T readById(ID id) throws Exception;
    void deleteById(ID id) throws Exception;

}
