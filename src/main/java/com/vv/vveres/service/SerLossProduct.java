package com.vv.vveres.service;


import com.vv.vveres.table.TbLossProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerLossProduct {
    @Autowired
    com.vv.vveres.repo.RepoLossProduct repoLossProduct;

    public List<TbLossProduct> getAll(){
        return  repoLossProduct.findAll();
    }

    public Optional<TbLossProduct> getById(Long Id){
        return  repoLossProduct.findById(Id);
    }

//    public List<TbLossProduct> getByLossDate(Date LossDate){
//        return  repoLossProduct.findByLossDate(LossDate);
//    }

    public TbLossProduct insSent(TbLossProduct invertory){
        return  repoLossProduct.save(invertory);
    }

    public  TbLossProduct updateSent(TbLossProduct invertory){
        return  repoLossProduct.save(invertory);
    }

    public  void delete(long Id){
        repoLossProduct.deleteById(Id);
    }
}
