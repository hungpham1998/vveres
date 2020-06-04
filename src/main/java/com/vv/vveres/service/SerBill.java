package com.vv.vveres.service;

import com.vv.vveres.table.TbBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class SerBill
{
    @Autowired
    com.vv.vveres.repo.RepoBill repoBill;
    public List<TbBill> FindByTitle(String title)
    {
        return repoBill.findByTitle(title);
    }
}
