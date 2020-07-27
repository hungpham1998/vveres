package com.vv.vveres.service;


import com.vv.vveres.dto.DTOExportInvoice;
import com.vv.vveres.mapper.ExportDetailMapper;

import com.vv.vveres.mapper.ExportInvoiceMapper;
import com.vv.vveres.repo.RepoExportDetail;
import com.vv.vveres.repo.RepoExportInvoice;
import com.vv.vveres.table.*;
import  com.vv.vveres.dto.DTOExportDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
//edit author: hungrost@gmail.com

@Service

public class SerExportInvoice {
    @Autowired
    RepoExportInvoice repoExportInvoice;

    @Autowired
    ExportInvoiceMapper exportInvoiceMapper;

    @Autowired
    SerExportDetail serExportDetail;

    @Autowired
    ExportDetailMapper exportDetailMapper;

    @Autowired
    RepoExportDetail repoExportDetail;


    public List<DTOExportInvoice> GetAll()

    {
        return exportInvoiceMapper.toDtoList(repoExportInvoice.findAll());
    }

    public List<DTOExportInvoice> getDTOExportInvoice() {
        List<TbExportInvoice> tbExportInvoices = repoExportInvoice.findAll();
        List<DTOExportInvoice> dtoExportInvoices = new ArrayList<>();
        for (TbExportInvoice tbExportInvoice : tbExportInvoices){
            DTOExportInvoice dtoExportInvoice = exportInvoiceMapper.toDto(tbExportInvoice);
            dtoExportInvoice.setDtoExportDetails(new ArrayList<>(serExportDetail.getAllExportDetailByExportInvoiceID(tbExportInvoice)));
            dtoExportInvoices.add(dtoExportInvoice);
        }
        return dtoExportInvoices;
    }



    public List<DTOExportInvoice> getDTOExportInvoicePage(Pageable pageable) {
        List<TbExportInvoice> tbExportInvoices = repoExportInvoice.findAllBy(pageable);
        List<DTOExportInvoice> dtoExportInvoices = new ArrayList<>();
        for (TbExportInvoice tbExportInvoice : tbExportInvoices){
            DTOExportInvoice dtoExportInvoice = exportInvoiceMapper.toDto(tbExportInvoice);
            dtoExportInvoice.setTbCustomerTitle(tbExportInvoice.getTbCustomer().getTitle());
            dtoExportInvoice.setTbStaffmentTitle(tbExportInvoice.getTbStaffment().getTitle());
            dtoExportInvoice.setTbStoreTitle(tbExportInvoice.getTbStore().getTitle());
            dtoExportInvoice.setTbTypeImexProductTitle(tbExportInvoice.getTbTypeImexProduct().getTitle());
            dtoExportInvoice.setDtoExportDetails(new ArrayList<>(serExportDetail.getAllExportDetailByExportInvoiceID(tbExportInvoice)));
            dtoExportInvoices.add(dtoExportInvoice);
        }
        return dtoExportInvoices;
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



    public List<TbExportInvoice> FindByInvoiceName(String invoiceName)
    {
        return repoExportInvoice.findByInvoicename(invoiceName);
    }

    public Page<TbExportInvoice> FindByInvoiceNamePage(String invoiceName, Pageable pageable){
        return  repoExportInvoice.findByInvoicename(invoiceName, pageable);
    }

    // public TbExportInvoice InsSent(TbExportInvoice input)


//    {
//        return repoExportInvoice.save(input);
//    }

    public void Delete (long id)
    {
        repoExportInvoice.deleteById(id);
    }

    public  TbExportInvoice UpdateSent (TbExportInvoice input) {
        return repoExportInvoice.save(input);
    }




    public DTOExportInvoice InsSent(DTOExportInvoice dtoExportInvoice){
        try {
            TbExportInvoice tbExportInvoice = exportInvoiceMapper.toEntity(dtoExportInvoice);
            List<DTOExportDetail> dtoExportDetails = dtoExportInvoice.getDtoExportDetails();
            TbExportDetail tbExportDetail;
            TbExportInvoice newtbExportInvoice = repoExportInvoice.save(tbExportInvoice);
            dtoExportInvoice.setId(newtbExportInvoice.getId());
            dtoExportInvoice.setTbStoreTitle(newtbExportInvoice.getTbStore().getTitle());
            dtoExportInvoice.setInvoicedate(newtbExportInvoice.getInvoicedate());
            dtoExportInvoice.setTbTypeImexProductTitle(newtbExportInvoice.getTbTypeImexProduct().getTitle());
            dtoExportInvoice.setTbCustomerTitle(newtbExportInvoice.getTbCustomer().getTitle());
            dtoExportInvoice.setTbStaffmentTitle(newtbExportInvoice.getTbStaffment().getTitle());
            for (DTOExportDetail dtoExportDetail : dtoExportDetails) {
                tbExportDetail = exportDetailMapper.toEntity(dtoExportDetail);
                tbExportDetail.setTbExportInvoice(newtbExportInvoice);
                repoExportDetail.save(tbExportDetail);
                dtoExportDetail.setId(tbExportDetail.getId());
                dtoExportDetail.setExpirydate(tbExportDetail.getExpirydate());
                dtoExportDetail.setTbProductTitle(tbExportDetail.getTbProduct().getTitle());
                dtoExportDetail.setTbProductId(tbExportDetail.getTbProduct().getId());
                dtoExportDetail.setTbUnitTitle(tbExportDetail.getTbUnit().getTitle());
                dtoExportDetail.setTbUnitId(tbExportDetail.getTbUnit().getId());
                dtoExportDetail.setTbImportInvoiceId(tbExportDetail.getTbImportInvoice().getId());
                dtoExportDetail.setTbImportInvoiceName(tbExportDetail.getTbImportInvoice().getInvoicename());
            }

            return dtoExportInvoice;
        }
        catch (Exception ex){
            System.out.println("error" + ex);
            return null;
        }
    }


}

