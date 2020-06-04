package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbSalaryCode  ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SerSalaryCode {
    @Autowired
    com.vv.vveres.repo.RepoSalaryCode  repoSalaryCode ;
    public Page<TbSalaryCode> GetAll(Pageable pageable) {
        return repoSalaryCode.findAll(pageable);
    }
    public Optional<TbSalaryCode > FindById(long id) {
        return repoSalaryCode .findById(id);
    }
    public List<TbSalaryCode > FindBySalary(String salary) {
        return repoSalaryCode .findBySalary(salary);
    }



    public TbSalaryCode  InsSent(TbSalaryCode  input){
        return repoSalaryCode .save(input);
    }
    public void Delete (long Id){
        repoSalaryCode .deleteById(Id);
    }
    public  TbSalaryCode  UpdateSent ( TbSalaryCode  input) {
        return  repoSalaryCode .save(input);
    }
}
