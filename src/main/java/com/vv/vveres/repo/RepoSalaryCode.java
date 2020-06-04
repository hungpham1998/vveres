package com.vv.vveres.repo;

import com.vv.vveres.table.TbSalaryCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface RepoSalaryCode extends JpaRepository<TbSalaryCode,Long>{
    Optional<TbSalaryCode> findById(long id);
    List<TbSalaryCode> findBySalary(String salary);
}
