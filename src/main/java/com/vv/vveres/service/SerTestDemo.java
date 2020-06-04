package com.vv.vveres.service;

import com.vv.vveres.table.TbTestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class SerTestDemo
{
    @Autowired
    com.vv.vveres.repo.RepoTestDemo repoTestDemo;
    public List<TbTestDemo> FindByTitle(String title)
    {
        return repoTestDemo.findByTitle(title);
    }

    public List<TbTestDemo>GetAll()
    {
        return repoTestDemo.findAll();
    }

    public Optional<TbTestDemo> GetById(Long id)
    {
        return repoTestDemo.findById(id);
    }
}

