package com.vv.vveres.repo;


import com.vv.vveres.table.TbDepartment;
import com.vv.vveres.table.TbDepartment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com
@Repository

public interface RepoDepartment extends JpaRepository<TbDepartment,Long>
{
    Optional<TbDepartment> findById(Long id);
    List<TbDepartment>findByTitle(String title);
    Page<TbDepartment> findByTitle(String title, Pageable pageable);
}
