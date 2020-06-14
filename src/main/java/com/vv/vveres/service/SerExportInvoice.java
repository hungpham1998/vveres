package com.vv.vveres.service;


import com.vv.vveres.table.TbExportInvoice;
import com.vv.vveres.table.TbExportInvoice;
import com.vv.vveres.table.TbExportInvoice;
import com.vv.vveres.table.TbExportInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Service

public class SerExportInvoice {
    @Autowired
    com.vv.vveres.repo.RepoExportInvoice repoExportInvoice;


    public List<TbExportInvoice> GetAll()

    {
        return repoExportInvoice.findAll();
    }

    public Page<TbExportInvoice> GetPage(Pageable pageable)
    {
        return repoExportInvoice.findAll(pageable);
    }


    public Optional<TbExportInvoice> FindById(Long id)
    {
        return repoExportInvoice.findById(id);
    }

    public List<TbExportInvoice> FindByCode(String code)
    {
        return repoExportInvoice.findByCode(code);
    }

    public Page<TbExportInvoice> FindByCodePage(String code, Pageable pageable){
        return  repoExportInvoice.findByCode(code, pageable);
    }

    public List<TbExportInvoice> FindByInvoiceDate(Date invoiceDate)
    {
        return repoExportInvoice.findByInvoiceDate(invoiceDate);
    }

    public Page<TbExportInvoice> FindByInvoiceDatePage(Date invoiceDate, Pageable pageable){
        return  repoExportInvoice.findByInvoiceDate(invoiceDate, pageable);
    }


    public List<TbExportInvoice> FindByInvoiceName(String invoiceName)
    {
        return repoExportInvoice.findByInvoiceName(invoiceName);
    }

    public Page<TbExportInvoice> FindByInvoiceNamePage(String invoiceName, Pageable pageable){
        return  repoExportInvoice.findByInvoiceName(invoiceName, pageable);
    }

    public TbExportInvoice InsSent(TbExportInvoice input)


    {
        return repoExportInvoice.save(input);
    }

    public void Delete (long id)
    {
        repoExportInvoice.deleteById(id);
    }

    public  TbExportInvoice UpdateSent (TbExportInvoice input) {
        return repoExportInvoice.save(input);
    }


}

