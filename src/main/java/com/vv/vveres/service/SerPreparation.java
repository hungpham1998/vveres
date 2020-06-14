package com.vv.vveres.service;


import com.vv.vveres.table.TbPreparation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com

@Service
public class SerPreparation {
    @Autowired
    com.vv.vveres.repo.RepoPreparation repoPreparation;

    public List<TbPreparation> getAll() {
        return repoPreparation.findAll();
    }

    public Optional<TbPreparation> getById(Long id){
        return  repoPreparation.findById(id);
    }

    public TbPreparation insSent(TbPreparation preparation){
         return  repoPreparation.save(preparation);
    }

    public  TbPreparation updateSent(TbPreparation preparation){
        return  repoPreparation.save(preparation);
    }

    public  void delete(Long id){
        repoPreparation.deleteById(id);
    }

    public Page<TbPreparation> getPage(Pageable pageable){
        return repoPreparation.findAll(pageable);
    }
}
