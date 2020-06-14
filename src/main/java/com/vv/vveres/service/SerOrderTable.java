package com.vv.vveres.service;

import com.vv.vveres.table.TbOrderTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com
@Service
public class SerOrderTable {
    @Autowired
    com.vv.vveres.repo.RepoOrderTable repoOrderTable;

    public List<TbOrderTable> getAll(){
        return  repoOrderTable.findAll();
    }

    public Page<TbOrderTable> getPage(Pageable pageable){
        return repoOrderTable.findAll(pageable);
    }

    public Optional<TbOrderTable> getById(Long id){
        return  repoOrderTable.findById(id);
    }

    public List<TbOrderTable> getByTitle(String title){
        return  repoOrderTable.getByTitle(title);
    }

    public  TbOrderTable insSent(TbOrderTable orderTable){
        return  repoOrderTable.save(orderTable);
    }

    public  TbOrderTable updateSent(TbOrderTable orderTable){
         return  repoOrderTable.save(orderTable);
    }

    public  void delete(Long id){
         repoOrderTable.deleteById(id);
    }

}
