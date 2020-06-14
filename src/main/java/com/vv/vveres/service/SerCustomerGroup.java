package com.vv.vveres.service;

import com.vv.vveres.table.TbCustomer;
import com.vv.vveres.table.TbCustomerGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

@Service


public class SerCustomerGroup
{
    @Autowired
    com.vv.vveres.repo.RepoCustomerGroup repoCustomerGroup;

    public List<TbCustomerGroup>GetAll()

    {
        return repoCustomerGroup.findAll();
    }

    public Page<TbCustomerGroup> GetPage(Pageable pageable)
    {
        return repoCustomerGroup.findAll(pageable);
    }

    public Optional<TbCustomerGroup> FindById(Long id)

    {
        return repoCustomerGroup.findById(id);
    }

    public List<TbCustomerGroup>FindByTitle(String title)

    {
        return repoCustomerGroup.findByTitle(title);
    }

    public Page<TbCustomerGroup> FindByTitlePage(String title, Pageable pageable){
        return  repoCustomerGroup.findByTitle(title, pageable);
    }

    public TbCustomerGroup InsSent(TbCustomerGroup input)


    {
        return repoCustomerGroup.save(input);
    }

    public void Delete (Long id)
    {
        repoCustomerGroup.deleteById(id);
    }

    public  TbCustomerGroup UpdateSent (TbCustomerGroup input)
    {
        return repoCustomerGroup.save(input);
    }

}


