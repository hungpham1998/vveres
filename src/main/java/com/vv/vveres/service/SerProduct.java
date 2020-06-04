package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerProduct {
    @Autowired
    com.vv.vveres.repo.RepoProduct repoProduct;
    public Page<TbProduct> GetAll(Pageable pageable) {
        return repoProduct.findAll(pageable);
    }
    public Optional<TbProduct> FindById(long id) {
        return repoProduct.findById(id);
    }
    public List<TbProduct> FindByTitle(String title) {
        return repoProduct.findByTitle(title);
    }


    public TbProduct InsSent(TbProduct input){
        return repoProduct.save(input);
    }
    public void Delete (long Id){
        repoProduct.deleteById(Id);
    }
    public  TbProduct UpdateSent ( TbProduct input) {
        return  repoProduct.save(input);
    }





}