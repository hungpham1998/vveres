package com.vv.vveres.service;


import com.vv.vveres.table.TbCustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// author: vutrananh98hn@gmail.com

@Service


public class SerCustomer
{
    @Autowired
    com.vv.vveres.repo.RepoCustomer repoCustomer;

    public List<TbCustomer>GetAll()

    {
        return repoCustomer.findAll();
    }

    public Page<TbCustomer> GetPage(Pageable pageable)
    {
        return repoCustomer.findAll(pageable);
    }


    public List<TbCustomer>FindByTitle(String title)

    {
        return repoCustomer.findByTitle(title);
    }

    public Page<TbCustomer> FindByTitlePage(String title, Pageable pageable){
        return  repoCustomer.findByTitle(title, pageable);
    }

    public List<TbCustomer>FindByAddress(String address)

    {
        return repoCustomer.findByAddress(address);
    }

    public Page<TbCustomer> FindByAddressPage(String address, Pageable pageable){
        return  repoCustomer.findByAddress(address, pageable);
    }

    public List<TbCustomer>FindByPhone(String phone)

    {
        return repoCustomer.findByPhone(phone);
    }

    public Page<TbCustomer> FindByPhonePage(String phone, Pageable pageable){
        return  repoCustomer.findByPhone(phone, pageable);
    }

    public List<TbCustomer>FindByBirthday(Date birthday)

    {
        return repoCustomer.findByBirthday(birthday);
    }

    public Page<TbCustomer> FindByBirthdayPage(Date birthday, Pageable pageable){
        return  repoCustomer.findByBirthday(birthday, pageable);
    }

    public Optional<TbCustomer> FindById(Long id)

    {
        return repoCustomer.findById(id);
    }

    public TbCustomer InsSent(TbCustomer input)

    {
        return repoCustomer.save(input);
    }

    public void Delete (Long id)
    {
        repoCustomer.deleteById(id);
    }

    public  TbCustomer UpdateSent (TbCustomer input) {
        return repoCustomer.save(input);
    }

}

