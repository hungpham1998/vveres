package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SerRestaurant {
    @Autowired
    com.vv.vveres.repo.RepoRestaurant repoRestaurant;
    public Page<TbRestaurant> GetAll(Pageable pageable) {
        return repoRestaurant.findAll(pageable);
    }
    public Optional<TbRestaurant> FindById(long id) {
        return repoRestaurant.findById(id);
    }
    public List<TbRestaurant> FindByTitle(String title) {
        return repoRestaurant.findByTitle(title);
    }
    public List<TbRestaurant> FindByPhoneNumber(String phoneNumber) {
        return repoRestaurant.findByPhoneNumber(phoneNumber);
    }


    public TbRestaurant InsSent(TbRestaurant input){
        return repoRestaurant.save(input);
    }
    public void Delete (long Id){
        repoRestaurant.deleteById(Id);
    }
    public  TbRestaurant UpdateSent ( TbRestaurant input) {
        return  repoRestaurant.save(input);
    }
}
