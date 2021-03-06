package com.vv.vveres.repo;


import com.vv.vveres.table.TbImportInvoice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface RepoImportInvoice extends JpaRepository<TbImportInvoice,Long> {

    List<TbImportInvoice> findByInvoicename(String invoicename);

    List<TbImportInvoice> findByCode(String code);

    Page<TbImportInvoice> findByCode(String code, Pageable pageable);

    Page<TbImportInvoice> findByInvoicename(String invoiceName, Pageable pageable);

}
