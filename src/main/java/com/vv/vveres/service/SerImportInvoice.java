package com.vv.vveres.service;

import com.vv.vveres.table.TbImportInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com
@Service
public class SerImportInvoice {

    @Autowired
    com.vv.vveres.repo.RepoImportInvoice repoImportInvoice;

    public List<TbImportInvoice> getAll(){
        return repoImportInvoice.findAll();
    }

    public Page<TbImportInvoice> getPage(Pageable pageable){
        return repoImportInvoice.findAll(pageable);
    }

    public Page<TbImportInvoice> getCodePage(String code, Pageable pageable){
        return repoImportInvoice.findByCode(code, pageable);
    }

    public Page<TbImportInvoice> getInvoiceNameCode(String invoiceName, Pageable pageable){
        return repoImportInvoice.findByInvoiceName(invoiceName, pageable);
    }

    public Optional<TbImportInvoice> getById(long id)
    {
        return repoImportInvoice.findById(id);
    }

    public  List<TbImportInvoice> getByCode(String code){
        return repoImportInvoice.findByCode(code);
    }

    public  List<TbImportInvoice> getByInvoiceName(String invoiceName){
        return repoImportInvoice.findByInvoiceName(invoiceName);
    }

    public  TbImportInvoice insSent(TbImportInvoice invoice){
        return  repoImportInvoice.save(invoice);
    }

    public  TbImportInvoice updateSent(TbImportInvoice invoice){
        return repoImportInvoice.save(invoice);
    }

    public  void delete (Long id){
       repoImportInvoice.deleteById(id);
    }
}
