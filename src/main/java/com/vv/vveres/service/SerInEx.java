package com.vv.vveres.service;


import com.vv.vveres.table.TbInEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerInEx {
    @Autowired
    com.vv.vveres.repo.RepoInEx repoInEx;

    public List<TbInEx> getAll(){
        return  repoInEx.findAll();
    }

    public Optional<TbInEx> getById(Long Id){
         return  repoInEx.findById(Id);
    }

    public List<TbInEx> getByTitle( String title){
         return  repoInEx.findByTitle(title);
    }

    public  List<TbInEx> getByInEx( String inEx){
         return  repoInEx.findByInEx(inEx);
    }

    public  TbInEx insSent(TbInEx InEx){
         return  repoInEx.save(InEx);
    }

    public  TbInEx updateSent(TbInEx InEx){
         return  repoInEx.save(InEx);
    }

    public  void delete( Long Id){
         repoInEx.deleteById(Id);
    }
}
