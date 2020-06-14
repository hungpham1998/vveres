package com.vv.vveres.service;

import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRestaurant;
import com.vv.vveres.table.TbSalaryCode  ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerSalaryCode {
    @Autowired
    com.vv.vveres.repo.RepoSalaryCode  repoSalaryCode ;
    public Page<TbSalaryCode> getPage(Pageable pageable) {
        return repoSalaryCode.findAll(pageable);
    }
    public List<TbSalaryCode> GetAll() {
        return repoSalaryCode.findAll();
    }
    public Optional<TbSalaryCode > FindById(Long id) {
        return repoSalaryCode .findById(id);
    }
    public List<TbSalaryCode > FindBySalary(String salary) {
        return repoSalaryCode .findBySalary(salary);
    }
    public Page<TbSalaryCode > FindBySalaryPage(String salary, Pageable pageable) {
        return repoSalaryCode .findBySalary(salary,pageable);
    }



    public TbSalaryCode  InsSent(TbSalaryCode  input){
        return repoSalaryCode .save(input);
    }
    public void Delete (Long Id){
        repoSalaryCode .deleteById(Id);
    }
    public  TbSalaryCode  UpdateSent ( TbSalaryCode  input) {
        return  repoSalaryCode .save(input);
    }
    public int DeleteAll(){
        try{
            repoSalaryCode.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
}

