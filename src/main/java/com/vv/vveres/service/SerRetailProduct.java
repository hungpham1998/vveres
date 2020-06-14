package com.vv.vveres.service;

import com.vv.vveres.table.TbRestaurant;
import com.vv.vveres.table.TbRetailProduct ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerRetailProduct {
    @Autowired
    com.vv.vveres.repo.RepoRetailProduct  repoRetailProduct ;
    public Page<TbRetailProduct> getPage(Pageable pageable) {
        return repoRetailProduct.findAll(pageable);
    }
    public List<TbRetailProduct> GetAll() {
        return repoRetailProduct.findAll();
    }
    public Optional<TbRetailProduct > FindById(long id) {
        return repoRetailProduct .findById(id);
    }
    public List<TbRetailProduct > FindByPrice(String price) {
        return repoRetailProduct .findByPrice(price);
    }
    public Page<TbRetailProduct> FindByPricePage(String price, Pageable pageable){
        return repoRetailProduct.findByPrice(price, pageable);
    }



    public TbRetailProduct  InsSent(TbRetailProduct  input){
        return repoRetailProduct .save(input);
    }
    public void Delete (Long id){
        repoRetailProduct .deleteById(id);
    }
    public  TbRetailProduct  UpdateSent ( TbRetailProduct  input) {
        return  repoRetailProduct .save(input);
    }
    public int DeleteAll(){
        try{
            repoRetailProduct.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
}

