package com.vv.vveres.repo;

import com.vv.vveres.table.TbExportDetail;
import com.vv.vveres.table.TbExportDetail;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Repository

public interface RepoExportDetail extends JpaRepository<TbExportDetail,Long>
{
    Optional<TbExportDetail> findById(Long id);
    List<TbExportDetail> findByExpiryDate(Date expiryDate);
    Page<TbExportDetail> findByExpiryDate(Date expiryDate, Pageable pageable);
    List<TbExportDetail> findByExportPrice(double exportPrice);
    Page<TbExportDetail> findByExportPrice(double exportPrice, Pageable pageable);
}
