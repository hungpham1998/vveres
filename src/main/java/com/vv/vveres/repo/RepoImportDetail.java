package com.vv.vveres.repo;

import com.vv.vveres.table.TbImportDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoImportDetail extends JpaRepository<TbImportDetail,Long> {
     Optional<TbImportDetail> findById(Long id);
    // public TbImportDetail updateStudent(TbImportDetail student);
}
