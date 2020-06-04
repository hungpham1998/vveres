package com.vv.vveres.service;

import com.vv.vveres.table.TbRetailProduct ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SerRetailProduct {
    @Autowired
    com.vv.vveres.repo.RepoRetailProduct  repoRetailProduct ;
    public Page<TbRetailProduct> GetAll(Pageable pageable) {
        return repoRetailProduct.findAll(pageable);
    }
    public Optional<TbRetailProduct > FindById(long id) {
        return repoRetailProduct .findById(id);
    }
    public List<TbRetailProduct > FindByPrice(String price) {
        return repoRetailProduct .findByPrice(price);
    }



    public TbRetailProduct  InsSent(TbRetailProduct  input){
        return repoRetailProduct .save(input);
    }
    public void Delete (long Id){
        repoRetailProduct .deleteById(Id);
    }
    public  TbRetailProduct  UpdateSent ( TbRetailProduct  input) {
        return  repoRetailProduct .save(input);
    }
}
