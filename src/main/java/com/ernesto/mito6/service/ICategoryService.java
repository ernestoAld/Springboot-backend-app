package com.ernesto.mito6.service;

import com.ernesto.mito6.models.Category;

//En esta interfaz le indicamos que tendremos los mismo metodos
//que la interfaz ICRUD pero con un tipo en especifico de Modelo e identificador
public interface ICategoryService extends ICRUD<Category,Integer>{
}
