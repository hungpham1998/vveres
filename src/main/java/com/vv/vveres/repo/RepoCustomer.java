package com.vv.vveres.repo;
import com.vv.vveres.table.TbCustomer;
import com.vv.vveres.table.TbCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
// author: vutrananh98hn@gmail.com

@Repository

public interface RepoCustomer extends JpaRepository<TbCustomer,Long>
{
    List<TbCustomer>findByTitle(String title);
    Page<TbCustomer> findByTitle(String title, Pageable pageable);
    List<TbCustomer>findByAddress(String address);
    Page<TbCustomer> findByAddress(String address, Pageable pageable);
    List<TbCustomer>findByPhone(String phone);
    Page<TbCustomer> findByPhone(String phone, Pageable pageable);
    List<TbCustomer>findByBirthday(Date birthday);
    Page<TbCustomer> findByBirthday(Date birthday, Pageable pageable);
    Optional<TbCustomer> findById(Long id);
}
