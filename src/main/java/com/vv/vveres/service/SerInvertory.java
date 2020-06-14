package com.vv.vveres.service;

import com.vv.vveres.table.TbInvertory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com
@Service
public class SerInvertory {
    @Autowired
    com.vv.vveres.repo.RepoInvertory repoInvertory;

    public List<TbInvertory> getAll(){
         return  repoInvertory.findAll();
    }

    public Page<TbInvertory> getPage(Pageable pageable){
        return repoInvertory.findAll(pageable);
    }

    public  Optional<TbInvertory> getById(Long id){
        return  repoInvertory.findById(id);
    }

    public TbInvertory insSent(TbInvertory invertory){
         return  repoInvertory.save(invertory);
    }

    public  TbInvertory updateSent(TbInvertory invertory){
         return  repoInvertory.save(invertory);
    }

    public  void delete(long id){
         repoInvertory.deleteById(id);
    }
}
