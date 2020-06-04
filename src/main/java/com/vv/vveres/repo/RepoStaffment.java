package com.vv.vveres.repo;

import com.vv.vveres.table.TbStaffment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface RepoStaffment extends JpaRepository<TbStaffment,Long>{
    Optional<TbStaffment> findById(long id);
    List<TbStaffment> findByIdCard(String idCard);
    List<TbStaffment> findByAddress(String address);
    List<TbStaffment> findByPhone(String phone);
    List<TbStaffment> findByMail(String mail);
}
