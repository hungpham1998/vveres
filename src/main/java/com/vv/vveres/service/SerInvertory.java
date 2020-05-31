package com.vv.vveres.service;

import com.vv.vveres.table.TbInvertory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerInvertory {
    @Autowired
    com.vv.vveres.repo.RepoInvertory repoInvertory;

    public List<TbInvertory> getAll(){
         return  repoInvertory.findAll();
    }

    public  Optional<TbInvertory> getById(Long Id){
        return  repoInvertory.findById(Id);
    }


    public TbInvertory insSent(TbInvertory invertory){
         return  repoInvertory.save(invertory);
    }

    public  TbInvertory updateSent(TbInvertory invertory){
         return  repoInvertory.save(invertory);
    }

    public  void delete(long Id){
         repoInvertory.deleteById(Id);
    }
}
