package com.vv.vveres.service;

import com.vv.vveres.table.TbBill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

@Service

public class SerBill
{
    @Autowired
    com.vv.vveres.repo.RepoBill repoBill;

    public List<TbBill>GetAll()

    {
        return repoBill.findAll();
    }

    public Page<TbBill> getPage(Pageable pageable)
    {
        return repoBill.findAll(pageable);
    }

    public List<TbBill> FindByTitle(String title)

    {
        return repoBill.findByTitle(title);
    }

    public Page<TbBill> FindByTitlePage(String title, Pageable pageable){
        return  repoBill.findByTitle(title, pageable);
    }


    public Optional<TbBill> FindById(Long id)

    {
        return repoBill.findById(id);
    }

    public TbBill InsSent(TbBill input)

    {
        return repoBill.save(input);
    }

    public void Delete (Long id)
    {
        repoBill.deleteById(id);
    }

    public  TbBill UpdateSent (TbBill input) {
        return repoBill.save(input);
    }

}

