package com.vv.vveres.repo;


import com.vv.vveres.table.TbImportInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface RepoImportInvoice extends JpaRepository<TbImportInvoice,Long> {

    List<TbImportInvoice> findByInvoiceName(String invoiceName);

   // Optional<TbImportInvoice> findByCode(String Code);



}
