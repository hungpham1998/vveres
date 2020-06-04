package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRateRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SerRateRestaurant {
    @Autowired
    com.vv.vveres.repo.RepoRateRestaurant repoRateRestaurant;
    public Page<TbRateRestaurant> GetAll(Pageable pageable) {
        return repoRateRestaurant.findAll(pageable);
    }
    public Optional<TbRateRestaurant> FindById(long id) {
        return repoRateRestaurant.findById(id);
    }

    public TbRateRestaurant InsSent(TbRateRestaurant input){
        return repoRateRestaurant.save(input);
    }
    public void Delete (long Id){
        repoRateRestaurant.deleteById(Id);
    }
    public  TbRateRestaurant UpdateSent ( TbRateRestaurant input) {
        return  repoRateRestaurant.save(input);
    }
}
