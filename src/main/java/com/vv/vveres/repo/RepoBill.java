package com.vv.vveres.repo;

import com.vv.vveres.table.TbBill;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
// author: vutrananh98hn@gmail.com

@Repository

public interface RepoBill extends JpaRepository<TbBill,Long>
{
    List<TbBill>findByTitle(String title);
    Page<TbBill> findByTitle(String title, Pageable pageable);
    Optional<TbBill> findById(Long Id);
}
