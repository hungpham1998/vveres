package com.vv.vveres.service;

import com.vv.vveres.table.TbOrderTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerOrderTable {
    @Autowired
    com.vv.vveres.repo.RepoOrderTable repoOrderTable;

    public List<TbOrderTable> getAll(){
        return  repoOrderTable.findAll();
    }

    public Optional<TbOrderTable> getById(Long Id){
        return  repoOrderTable.findById(Id);
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

    public  void delete(Long Id){
         repoOrderTable.deleteById(Id);
    }

}
