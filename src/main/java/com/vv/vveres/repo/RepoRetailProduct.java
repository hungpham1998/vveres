package com.vv.vveres.repo;

import com.vv.vveres.table.TbRetailProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface RepoRetailProduct extends JpaRepository<TbRetailProduct,Long>{
    Optional<TbRetailProduct> findById(long id);
    List<TbRetailProduct> findByPrice(String price);
}
