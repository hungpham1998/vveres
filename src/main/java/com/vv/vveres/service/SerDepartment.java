package com.vv.vveres.service;


import com.vv.vveres.table.TbDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

@Service

public class SerDepartment
{
    @Autowired
    com.vv.vveres.repo.RepoDepartment repoDepartment;

    public List<TbDepartment>GetAll()

    {
        return repoDepartment.findAll();
    }

    public Page<TbDepartment> GetPage(Pageable pageable)
    {
        return repoDepartment.findAll(pageable);
    }

    public Optional<TbDepartment> FindById(Long id)

    {
        return repoDepartment.findById(id);
    }

    public List<TbDepartment>FindByTitle(String title)

    {
        return repoDepartment.findByTitle(title);
    }

    public Page<TbDepartment> FindByTitlePage(String title, Pageable pageable){
        return  repoDepartment.findByTitle(title, pageable);
    }

    public TbDepartment InsSent(TbDepartment input)


    {
        return repoDepartment.save(input);
    }

    public void Delete (Long id)
    {
        repoDepartment.deleteById(id);
    }

    public  TbDepartment UpdateSent (TbDepartment input)
    {
        return repoDepartment.save(input);
    }


}
