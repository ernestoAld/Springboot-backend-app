package com.ernesto.mito6.service;

import java.util.List;

public interface ICRUD <T,ID>{

    T save(T t) throws Exception;
    T update(T t) throws Exception;
    List<T> readAll() throws Exception;
    T readById(ID id) throws Exception;
    void deleteById(ID id) throws Exception;

}