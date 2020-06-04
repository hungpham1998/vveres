package com.vv.vveres.service;
import com.vv.vveres.table.TbSalaryCode;
import com.vv.vveres.table.TbStaffment  ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SerStaffment {
    @Autowired
    com.vv.vveres.repo.RepoStaffment  repoStaffment ;
    public Page<TbStaffment> GetAll(Pageable pageable) {
        return repoStaffment.findAll(pageable);
    }
    public Optional<TbStaffment > FindById(long id) {
        return repoStaffment .findById(id);
    }
    public List<TbStaffment > FindByIdCard(String idCard) {
        return repoStaffment .findByIdCard(idCard);
    }
    public List<TbStaffment > FindByAddress(String address) {
        return repoStaffment .findByAddress(address);
    }
    public List<TbStaffment > FindByPhone(String phone) {
        return repoStaffment .findByPhone(phone);
    }
    public List<TbStaffment > FindByMail(String mail) {
        return repoStaffment .findByMail(mail);
    }



    public TbStaffment  InsSent(TbStaffment  input){
        return repoStaffment .save(input);
    }
    public void Delete (long Id){
        repoStaffment .deleteById(Id);
    }
    public  TbStaffment  UpdateSent ( TbStaffment  input) {
        return  repoStaffment .save(input);
    }
}
