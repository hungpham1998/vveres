package com.vv.vveres.service;

// author: vutrananh98hn@gmail.com

import com.vv.vveres.table.TbExportDetail;
import com.vv.vveres.table.TbExportDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Service

public class SerExportDetail
{

    @Autowired
    com.vv.vveres.repo.RepoExportDetail repoExportDetail;

    public List<TbExportDetail> GetAll()

    {
        return repoExportDetail.findAll();
    }

    public Page<TbExportDetail> GetPage(Pageable pageable)
    {
        return repoExportDetail.findAll(pageable);
    }

    public Optional<TbExportDetail> FindById(Long id)
    {
        return repoExportDetail.findById(id);
    }

    public List<TbExportDetail> FindByExpiryDate(Date expiryDate)
    {
        return repoExportDetail.findByExpiryDate(expiryDate);
    }

    public Page<TbExportDetail> FindByExpiryDatePage(Date expiryDate, Pageable pageable){
        return  repoExportDetail.findByExpiryDate(expiryDate, pageable);
    }

    public List<TbExportDetail> FindByExportPrice(double exportPrice) { return repoExportDetail.findByExportPrice(exportPrice);}

    public Page<TbExportDetail> FindByExportPricePage(double exportPrice, Pageable pageable){
        return  repoExportDetail.findByExportPrice(exportPrice, pageable);
    }

    public TbExportDetail InsSent(TbExportDetail input)


    {
        return repoExportDetail.save(input);
    }

    public void Delete (Long id)
    {
        repoExportDetail.deleteById(id);
    }

    public  TbExportDetail UpdateSent (TbExportDetail input) {
        return repoExportDetail.save(input);
    }
}
