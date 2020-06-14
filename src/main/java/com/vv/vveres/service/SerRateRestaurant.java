package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRateRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerRateRestaurant {
    @Autowired
    com.vv.vveres.repo.RepoRateRestaurant repoRateRestaurant;
    public Page<TbRateRestaurant> getPage(Pageable pageable) {
        return repoRateRestaurant.findAll(pageable);
    }
    public List<TbRateRestaurant> GetAll() {
        return repoRateRestaurant.findAll();
    }
    public Optional<TbRateRestaurant> FindById(Long id) {
        return repoRateRestaurant.findById(id);
    }

    public TbRateRestaurant InsSent(TbRateRestaurant input){
        return repoRateRestaurant.save(input);
    }
    public void Delete (Long id){
        repoRateRestaurant.deleteById(id);
    }
    public  TbRateRestaurant UpdateSent ( TbRateRestaurant input) {
        return  repoRateRestaurant.save(input);
    }
    public int DeleteAll(){
        try{
            repoRateRestaurant.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
}

