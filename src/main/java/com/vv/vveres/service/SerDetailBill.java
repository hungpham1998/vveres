package com.vv.vveres.service;

import com.vv.vveres.table.TbDetailBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

@Service

public class SerDetailBill
{
    @Autowired
    com.vv.vveres.repo.RepoDetailBill repoDetailBill;

    public List<TbDetailBill>GetAll()

    {
        return repoDetailBill.findAll();
    }

    public Page<TbDetailBill> GetPage(Pageable pageable)
    {
        return repoDetailBill.findAll(pageable);
    }

    public Optional<TbDetailBill> FindById(Long id)

    {
        return repoDetailBill.findById(id);
    }

    public TbDetailBill InsSent(TbDetailBill input)


    {
        return repoDetailBill.save(input);
    }

    public void Delete (Long id)
    {
        repoDetailBill.deleteById(id);
    }

    public  TbDetailBill UpdateSent (TbDetailBill input)
    {
        return repoDetailBill.save(input);
    }


}
