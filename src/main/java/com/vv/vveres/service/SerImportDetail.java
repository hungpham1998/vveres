package com.vv.vveres.service;



import com.vv.vveres.table.TbImportDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerImportDetail {
    @Autowired
    com.vv.vveres.repo.RepoImportDetail repoImportDetail;
    public List<TbImportDetail> getAll() {
        return repoImportDetail.findAll();
    }

    public Optional<TbImportDetail> getById(Long Id){
        return  repoImportDetail.findById(Id);
    }

    public TbImportDetail InsSent(TbImportDetail input){
        return repoImportDetail.save(input);
    }

    public void Delete (Long Id){
        repoImportDetail.deleteById(Id);
    }



    public  TbImportDetail UpdateSent (TbImportDetail input) {
            return repoImportDetail.save(input);
    }
}
