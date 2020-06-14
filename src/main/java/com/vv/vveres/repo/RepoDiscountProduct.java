package com.vv.vveres.repo;


import com.vv.vveres.table.TbDiscountProduct;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Repository

public interface RepoDiscountProduct extends JpaRepository<TbDiscountProduct,Long>
{
    Optional<TbDiscountProduct> findById(Long id);
    List<TbDiscountProduct>findByStartDate(Date startDate);
    Page<TbDiscountProduct> findByStartDate(Date startDate, Pageable pageable);
    List<TbDiscountProduct>findByDuaDate(Date duaDate);
    Page<TbDiscountProduct> findByDuaDate(Date duaDate, Pageable pageable);
    List<TbDiscountProduct>findByPrice(double price);
    Page<TbDiscountProduct> findByPrice(double price, Pageable pageable);
}