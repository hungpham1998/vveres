package com.vv.vveres.service;

// author: vutrananh98hn@gmail.com

import com.vv.vveres.dto.DTOExportDetail;
import com.vv.vveres.dto.DTOOrderDetail;
import com.vv.vveres.mapper.ExportDetailMapper;
import com.vv.vveres.repo.RepoExportDetail;
import com.vv.vveres.table.TbExportDetail;
import com.vv.vveres.table.TbExportInvoice;
import com.vv.vveres.table.TbOrder;
import com.vv.vveres.table.TbOrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

//edit author: hungrost@gmail.com

@Service

public class SerExportDetail
{

    @Autowired
    RepoExportDetail repoExportDetail;


    @Autowired
    ExportDetailMapper exportDetailMapper;

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

    public List<DTOExportDetail> getAllExportDetailByExportInvoiceID(TbExportInvoice TbExportInvoice) {
        List<TbExportDetail> exportDetails = repoExportDetail.findAllByTbExportInvoice(TbExportInvoice);
        List<DTOExportDetail> dtoExportDetails = new ArrayList<>();
        for (TbExportDetail tbExportDetail : exportDetails){
            DTOExportDetail dtoExportDetail = exportDetailMapper.toDto(tbExportDetail);
            dtoExportDetail.setTbProductTitle(tbExportDetail.getTbProduct().getTitle());
            dtoExportDetail.setTbProductId(tbExportDetail.getTbProduct().getId());
            dtoExportDetail.setTbUnitTitle(tbExportDetail.getTbUnit().getTitle());
            dtoExportDetail.setTbUnitId(tbExportDetail.getTbUnit().getId());
            dtoExportDetail.setTbImportInvoiceId(tbExportDetail.getTbImportInvoice().getId());
            dtoExportDetail.setTbImportInvoiceName(tbExportDetail.getTbImportInvoice().getInvoicename());
            dtoExportDetails.add(dtoExportDetail);
        }
        return dtoExportDetails;
    }


    public List<DTOExportDetail> getAllExportDetail(Pageable pageable) {
        List<TbExportDetail> exportDetails = repoExportDetail.findAllBy(pageable);
        List<DTOExportDetail> dtoExportDetails =new ArrayList<>();
        for (TbExportDetail tbExportDetail : exportDetails){
            DTOExportDetail dtoExportDetail = exportDetailMapper.toDto(tbExportDetail);
            dtoExportDetail.setTbProductTitle(tbExportDetail.getTbProduct().getTitle());
            dtoExportDetail.setTbProductId(tbExportDetail.getTbProduct().getId());
            dtoExportDetail.setTbUnitTitle(tbExportDetail.getTbUnit().getTitle());
            dtoExportDetail.setTbUnitId(tbExportDetail.getTbUnit().getId());
            dtoExportDetail.setTbImportInvoiceId(tbExportDetail.getTbImportInvoice().getId());
            dtoExportDetail.setTbImportInvoiceName(tbExportDetail.getTbImportInvoice().getInvoicename());
            dtoExportDetails.add(dtoExportDetail);
        }
        return dtoExportDetails;
    }

    public  DTOExportDetail update (DTOExportDetail dtoExportDetail){
        try {
            TbExportDetail tbExportDetail = exportDetailMapper.toEntity(dtoExportDetail);
            repoExportDetail.save(tbExportDetail);

            return dtoExportDetail;
        }
        catch (Exception err){
            return null;
        }
    }
}
