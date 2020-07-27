package com.vv.vveres.service;
import com.vv.vveres.table.TbStaffment  ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerStaffment {
    @Autowired
    com.vv.vveres.repo.RepoStaffment  repoStaffment ;
    public Page<TbStaffment> getPage(Pageable pageable) {
        return repoStaffment.findAll(pageable);
    }
    public List<TbStaffment> GetAll() {
        return repoStaffment.findAll();
    }

    public Optional<TbStaffment > FindById(Long id) {
        return repoStaffment .findById(id);
    }
    public List<TbStaffment > FindByTitle(String title) {
        return repoStaffment .findByTitle(title);
    }
    public List<TbStaffment > FindByIdCard(String idcard) {
        return repoStaffment .findByIdcard(idcard);
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
    public Page<TbStaffment> FindByTitlePage(String title, Pageable pageable){
        return repoStaffment.findByTitle(title, pageable);
    }
    public Page<TbStaffment> FindByIdCardPage(String idcard, Pageable pageable){
        return repoStaffment.findByIdcard(idcard, pageable);
    }
    public Page<TbStaffment> FindByAddressPage(String address, Pageable pageable){
        return repoStaffment.findByAddress(address, pageable);
    }
    public Page<TbStaffment> FindByPhonePage(String phone, Pageable pageable){
        return repoStaffment.findByPhone(phone, pageable);
    }
    public Page<TbStaffment> FindByMailPage(String mail, Pageable pageable){
        return repoStaffment.findByMail(mail, pageable);
    }

    public TbStaffment  InsSent(TbStaffment  input){
        try{
            Timestamp ts = new Timestamp(input.getBirthday().getTime());
            Timestamp startday = new Timestamp(input.getStartday().getTime());
            input.setStartday(startday);
            input.setBirthday(ts);
            return repoStaffment.save(input);
        }
            catch (Exception ex){
            return null;
        }
    }
    public void Delete (Long id){
        repoStaffment .deleteById(id);
    }
    public  TbStaffment  UpdateSent ( TbStaffment  input) {
        return  repoStaffment .save(input);
    }
    public int DeleteAll(){
        try{
            repoStaffment.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
}

