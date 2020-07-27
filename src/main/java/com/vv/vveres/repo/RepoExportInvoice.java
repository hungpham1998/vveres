package com.vv.vveres.repo;

import com.vv.vveres.table.TbExportInvoice;
import com.vv.vveres.table.TbExportInvoice;
import com.vv.vveres.table.TbOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Repository

public interface RepoExportInvoice extends JpaRepository<TbExportInvoice,Long>
{    List<TbExportInvoice> findAllBy(Pageable pageable);
    Optional<TbExportInvoice> findById(Long id);
    List<TbExportInvoice> findByCode(String code);
    Page<TbExportInvoice> findByCode(String code, Pageable pageable);
    List<TbExportInvoice> findByInvoicename(String invoicename);
    Page<TbExportInvoice> findByInvoicename(String invoicename, Pageable pageable);

}
