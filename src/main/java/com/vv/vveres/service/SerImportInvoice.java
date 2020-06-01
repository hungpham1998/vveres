package com.vv.vveres.service;

import com.vv.vveres.table.TbImportInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerImportInvoice {

    @Autowired
    com.vv.vveres.repo.RepoImportInvoice repoImportInvoice;

    public List<TbImportInvoice> getAll(){
        return repoImportInvoice.findAll();
    }

    public Optional<TbImportInvoice> getById(long Id)
    {
        return repoImportInvoice.findById(Id);
    }

    public  List<TbImportInvoice> getByCode(String code){
        return repoImportInvoice.findByCode(code);
    }

    public  List<TbImportInvoice> getByInvoiceName(String InvoiceName){
        return repoImportInvoice.findByInvoiceName(InvoiceName);
    }

    public  TbImportInvoice insSent(TbImportInvoice invoice){
        return  repoImportInvoice.save(invoice);
    }

    public  TbImportInvoice updateSent(TbImportInvoice invoice){
        return repoImportInvoice.save(invoice);
    }

    public  void delete (Long Id){
       repoImportInvoice.deleteById(Id);
    }
}
