package com.vv.vveres.repo;

import com.vv.vveres.table.TbImportExportSepcial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepoImportExportSepcial extends JpaRepository<TbImportExportSepcial,Long> {
}
