package com.vv.vveres.service;

import com.vv.vveres.table.TbGroupProduct;
import com.vv.vveres.table.TbGroupProduct;
import com.vv.vveres.table.TbGroupProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Service

public class SerGroupProduct {

    @Autowired
    com.vv.vveres.repo.RepoGroupProduct repoGroupProduct;

    public List<TbGroupProduct> GetAll()

    {
        return repoGroupProduct.findAll();
    }

    public Page<TbGroupProduct> GetPage(Pageable pageable)
    {
        return repoGroupProduct.findAll(pageable);
    }

    public Optional<TbGroupProduct> FindById(Long id)

    {
        return repoGroupProduct.findById(id);
    }

    public List<TbGroupProduct>FindByCode(String code)

    {
        return repoGroupProduct.findByCode(code);
    }

    public Page<TbGroupProduct> FindByCodePage(String code, Pageable pageable){
        return  repoGroupProduct.findByCode(code, pageable);
    }

    public List<TbGroupProduct>FindByTitle(String title)

    {
        return repoGroupProduct.findByTitle(title);
    }

    public Page<TbGroupProduct> FindByTitlePage(String title, Pageable pageable){
        return  repoGroupProduct.findByTitle(title, pageable);
    }

    public TbGroupProduct InsSent(TbGroupProduct input)


    {
        return repoGroupProduct.save(input);
    }

    public void Delete (Long id)
    {
        repoGroupProduct.deleteById(id);
    }

    public  TbGroupProduct UpdateSent (TbGroupProduct input)
    {
        return repoGroupProduct.save(input);
    }

}

