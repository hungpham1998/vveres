package com.vv.vveres.service;

import com.vv.vveres.table.TbRestaurant;
import com.vv.vveres.table.TbStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerStore {
    @Autowired
    com.vv.vveres.repo.RepoStore repoStore;
    public Page<TbStore> getPage(Pageable pageable) {
        return repoStore.findAll(pageable);
    }
    public List<TbStore> GetAll() {
        return repoStore.findAll();
    }

    public Optional<TbStore> FindById(Long id) {
        return repoStore.findById(id);
    }
    public List<TbStore> FindByTitle(String title) {
        return repoStore.findByTitle(title);
    }
    public Page<TbStore> FindByTitlePage(String title,Pageable pageable) {
        return repoStore.findByTitle(title,pageable);
    }


    public TbStore InsSent(TbStore input){
        return repoStore.save(input);
    }
    public void Delete (Long id){
        repoStore.deleteById(id);
    }
    public  TbStore UpdateSent ( TbStore input) {
        return  repoStore.save(input);
    }
    public int DeleteAll(){
        try{
            repoStore.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }

}

