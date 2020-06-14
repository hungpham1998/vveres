package com.vv.vveres.repo;

import com.vv.vveres.table.TbStaffment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Repository
public interface RepoStaffment extends JpaRepository<TbStaffment,Long>{
    Optional<TbStaffment> findById(Long id);
    List<TbStaffment> findByTitle(String title);
    List<TbStaffment> findByIdCard(String idCard);
    List<TbStaffment> findByAddress(String address);
    List<TbStaffment> findByPhone(String phone);
    List<TbStaffment> findByMail(String mail);
    Page<TbStaffment> findByTitle(String title,Pageable pageable);
    Page<TbStaffment> findByIdCard(String idCard, Pageable pageable);
    Page<TbStaffment> findByAddress(String address, Pageable pageable);
    Page<TbStaffment> findByPhone(String phone, Pageable pageable);
    Page<TbStaffment> findByMail(String mail, Pageable pageable);
}

