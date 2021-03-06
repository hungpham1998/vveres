package com.vv.vveres.repo;

import com.vv.vveres.table.TbRetailProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Repository
public interface RepoRetailProduct extends JpaRepository<TbRetailProduct,Long>{
    Optional<TbRetailProduct> findById(Long id);
    List<TbRetailProduct> findByPrice(String price);
    Page<TbRetailProduct> findByPrice(String price, Pageable pageable);
}

