package com.vv.vveres.repo;

import com.vv.vveres.table.TbProduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepoProduct extends JpaRepository<TbProduct,Long> {
    Optional<TbProduct> findById(long id);
    List<TbProduct> findByTitle(String title);



}
