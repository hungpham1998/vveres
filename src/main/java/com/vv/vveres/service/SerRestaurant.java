package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerRestaurant {
    @Autowired
    com.vv.vveres.repo.RepoRestaurant repoRestaurant;
    public Page<TbRestaurant> getPage(Pageable pageable) {
        return repoRestaurant.findAll(pageable);
    }
    public List<TbRestaurant> GetAll() {
        return repoRestaurant.findAll();
    }
    public Optional<TbRestaurant> FindById(long id) {
        return repoRestaurant.findById(id);
    }
    public List<TbRestaurant> FindByTitle(String title) {
        return repoRestaurant.findByTitle(title);
    }
    public Page<TbRestaurant> FindByTitlePage(String title, Pageable pageable){
        return  repoRestaurant.findByTitle(title, pageable);
    }
    public List<TbRestaurant> FindByPhoneNumber(String phoneNumber) {
        return repoRestaurant.findByPhoneNumber(phoneNumber);
    }
    public Page<TbRestaurant> FindByPhoneNumberPage(String phoneNumber, Pageable pageable) {
        return repoRestaurant.findByPhoneNumber(phoneNumber,pageable);
    }

    public TbRestaurant InsSent(TbRestaurant input){
        return repoRestaurant.save(input);
    }
    public void Delete (Long id){
        repoRestaurant.deleteById(id);
    }
    public  TbRestaurant UpdateSent ( TbRestaurant input) {
        return  repoRestaurant.save(input);
    }
    public int DeleteAll(){
        try{
            repoRestaurant.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
}

