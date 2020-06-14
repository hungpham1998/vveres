package com.vv.vveres.service;



import com.vv.vveres.table.TbImportDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com
@Service
public class SerImportDetail {
    @Autowired
    com.vv.vveres.repo.RepoImportDetail repoImportDetail;
    public List<TbImportDetail> getAll() {
        return repoImportDetail.findAll();
    }

    public Page<TbImportDetail> getPage(Pageable pageable){
        return repoImportDetail.findAll(pageable);
    }


    public Optional<TbImportDetail> getById(Long id){
        return  repoImportDetail.findById(id);
    }

    public TbImportDetail InsSent(TbImportDetail input){
        return repoImportDetail.save(input);
    }

    public void Delete (Long id){
        repoImportDetail.deleteById(id);
    }



    public  TbImportDetail UpdateSent (TbImportDetail input) {
            return repoImportDetail.save(input);
    }
}
