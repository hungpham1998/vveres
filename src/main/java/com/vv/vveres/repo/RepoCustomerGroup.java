package com.vv.vveres.repo;

import com.vv.vveres.table.TbCustomer;
import com.vv.vveres.table.TbCustomerGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

@Repository

public interface RepoCustomerGroup extends JpaRepository<TbCustomerGroup,Long>
{
    List<TbCustomerGroup>findByTitle(String title);
    Page<TbCustomerGroup> findByTitle(String title, Pageable pageable);
    Optional<TbCustomerGroup> findById(Long id);
}
