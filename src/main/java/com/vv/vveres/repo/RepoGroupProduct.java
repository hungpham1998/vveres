package com.vv.vveres.repo;

import com.vv.vveres.table.TbGroupProduct;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface RepoGroupProduct extends JpaRepository<TbGroupProduct,Long>
{
    List<TbGroupProduct> findByTitle(String title);
    Page<TbGroupProduct> findByTitle(String title, Pageable pageable);
    List<TbGroupProduct> findByCode(String code);
    Page<TbGroupProduct> findByCode(String code, Pageable pageable);
    Optional<TbGroupProduct> findById(Long id);
}

