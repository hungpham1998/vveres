package com.vv.vveres.service;

import com.vv.vveres.table.TbDiscountProduct;
import com.vv.vveres.table.TbDiscountProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

@Service

public class SerDiscountProduct
{
    @Autowired
    com.vv.vveres.repo.RepoDiscountProduct repoDiscountProduct;

    public List<TbDiscountProduct>GetAll()

    {
        return repoDiscountProduct.findAll();
    }

    public Page<TbDiscountProduct> GetPage(Pageable pageable)
    {
        return repoDiscountProduct.findAll(pageable);
    }

    public Optional<TbDiscountProduct> FindById(Long id)

    {
        return repoDiscountProduct.findById(id);
    }

    public List<TbDiscountProduct> FindByStartDate(Date startDate) { return repoDiscountProduct.findByStartDate(startDate);}

    public Page<TbDiscountProduct> FindByStartDatePage(Date startDate, Pageable pageable){
        return  repoDiscountProduct.findByStartDate(startDate, pageable);
    }

    public List<TbDiscountProduct> FindByDuaDate(Date duaDate) { return repoDiscountProduct.findByDuaDate(duaDate);}

    public Page<TbDiscountProduct> FindByDuadatePage(Date duaDate, Pageable pageable){
        return  repoDiscountProduct.findByDuaDate(duaDate, pageable);
    }

    public List<TbDiscountProduct> FindByPrice(double price) { return repoDiscountProduct.findByPrice(price);}

    public Page<TbDiscountProduct> FindByPricePage(double price, Pageable pageable){
        return  repoDiscountProduct.findByPrice(price, pageable);
    }

    public TbDiscountProduct InsSent(TbDiscountProduct input)


    {
        return repoDiscountProduct.save(input);
    }

    public void Delete (Long id)
    {
        repoDiscountProduct.deleteById(id);
    }

    public  TbDiscountProduct UpdateSent (TbDiscountProduct input)
    {
        return repoDiscountProduct.save(input);
    }


}
