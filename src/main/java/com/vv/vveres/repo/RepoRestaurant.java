package com.vv.vveres.repo;

import com.vv.vveres.table.TbRestaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Repository
public interface RepoRestaurant extends JpaRepository<TbRestaurant,Long> {
    Optional<TbRestaurant> findById(Long id);
    List<TbRestaurant> findByTitle(String title);
    Page<TbRestaurant> findByTitle(String title, Pageable pageable);
    List<TbRestaurant> findByPhoneNumber(String phoneNumber);
    Page<TbRestaurant> findByPhoneNumber(String phoneNumber, Pageable pageable);
}

