package com.vv.vveres.repo;

import com.vv.vveres.table.TbRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface RepoRestaurant extends JpaRepository<TbRestaurant,Long> {
    Optional<TbRestaurant> findById(long id);
    List<TbRestaurant> findByTitle(String title);
    List<TbRestaurant> findByPhoneNumber(String phoneNumber);
}
