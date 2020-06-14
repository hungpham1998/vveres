package com.vv.vveres.repo;

import com.vv.vveres.table.TbSalaryCode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Repository
public interface RepoSalaryCode extends JpaRepository<TbSalaryCode,Long>{
    Optional<TbSalaryCode> findById(Long id);
    List<TbSalaryCode> findBySalary(String salary);
    Page<TbSalaryCode> findBySalary(String salary, Pageable pageable);
}

