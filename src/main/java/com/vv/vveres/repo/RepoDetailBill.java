package com.vv.vveres.repo;

import com.vv.vveres.table.TbDetailBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Repository

public interface RepoDetailBill extends JpaRepository<TbDetailBill,Long>
{
    Optional<TbDetailBill> findById(Long id);
}
