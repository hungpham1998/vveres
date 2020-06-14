package com.vv.vveres.service;

import com.vv.vveres.table.TbImportExportSepcial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com
@Service
public class SerImportExportSpecial {
    @Autowired
    com.vv.vveres.repo.RepoImportExportSepcial repoImportExportSepcial;

    public List<TbImportExportSepcial> getAll(){
        return  repoImportExportSepcial.findAll();
    }

    public Page<TbImportExportSepcial> getPage(Pageable pageable){
        return repoImportExportSepcial.findAll(pageable);
    }

    public Optional<TbImportExportSepcial> getById(Long id){
         return  repoImportExportSepcial.findById(id);
    }

    public TbImportExportSepcial insSent(TbImportExportSepcial ImportExportSpecial){
         return  repoImportExportSepcial.save(ImportExportSpecial);
    }

    public TbImportExportSepcial updateSent(TbImportExportSepcial importExportSepcial){
         return  repoImportExportSepcial.save(importExportSepcial);
    }

    public void  delete(Long id){
         repoImportExportSepcial.deleteById(id);
    }
}
