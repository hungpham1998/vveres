package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerProduct {
    @Autowired
    com.vv.vveres.repo.RepoProduct repoProduct;
    public Page<TbProduct> getPage(Pageable pageable) {
        return repoProduct.findAll(pageable);
    }
    public List<TbProduct> GetAll() {
        return repoProduct.findAll();
    }
    public Optional<TbProduct> FindById(Long id) {
        return repoProduct.findById(id);
    }
    public List<TbProduct> FindByTitle(String title) {
        return repoProduct.findByTitle(title);
    }
    public Page<TbProduct> FindByTitlePage(String title, Pageable pageable){
        return  repoProduct.findByTitle(title, pageable);
    }

    public TbProduct InsSent(TbProduct input){
        return repoProduct.save(input);
    }
    public void Delete (Long id){
        repoProduct.deleteById(id);
    }
    public  TbProduct UpdateSent ( TbProduct input) {
        return  repoProduct.save(input);
    }
    public int DeleteAll(){
        try{
            repoProduct.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }




}
