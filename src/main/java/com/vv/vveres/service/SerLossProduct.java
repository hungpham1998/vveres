package com.vv.vveres.service;


import com.vv.vveres.table.TbLossProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com
@Service
public class SerLossProduct {
    @Autowired
    com.vv.vveres.repo.RepoLossProduct repoLossProduct;

    public List<TbLossProduct> getAll(){
        return  repoLossProduct.findAll();
    }

    public Page<TbLossProduct> getPage(Pageable pageable){
        return repoLossProduct.findAll(pageable);
    }

    public Optional<TbLossProduct> getById(Long id){
        return  repoLossProduct.findById(id);
    }


    public TbLossProduct insSent(TbLossProduct invertory){
        return  repoLossProduct.save(invertory);
    }

    public  TbLossProduct updateSent(TbLossProduct invertory){
        return  repoLossProduct.save(invertory);
    }

    public  void delete(long id){
        repoLossProduct.deleteById(id);
    }
}
