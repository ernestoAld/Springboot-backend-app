package com.ernesto.mito6.service.impl;

import com.ernesto.mito6.models.Cliente;
import com.ernesto.mito6.repositories.IClienteRepo;
import com.ernesto.mito6.repositories.IGenericRepo;
import com.ernesto.mito6.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl extends CRUDImpl<Cliente,Integer> implements IClientService {

    @Autowired
    private IClienteRepo repo;

    @Override
    protected IGenericRepo<Cliente, Integer> getRepo() {
        return repo;
    }
}

/*
 @Autowired
    private IClienteRepo repo;

    @Override
    public Cliente save(Cliente Cliente) throws Exception {
        return repo.save(Cliente);
    }

    @Override
    public Cliente update(Cliente Cliente) throws Exception {
        return repo.save(Cliente);
    }

    @Override
    public List<Cliente> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Cliente readById(Integer id) throws Exception {
        Optional<Cliente> returned = repo.findById(id);
        if(returned.isPresent()){
            return returned.get();
        }
        throw new RuntimeException("Cliente WITH ID: "+id+" DOES NOT EXISTS");
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        Optional<Cliente> returned = repo.findById(id);
        if(returned.isEmpty()){
            throw new RuntimeException("Cliente WITH ID: "+id+" DOES NOT EXISTS");
        }else{
            repo.deleteById(id);
        }
    }
* */