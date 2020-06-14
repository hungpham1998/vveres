package com.vv.vveres.repo;

import com.vv.vveres.dto.DTOProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoDTOProduct extends JpaRepository<DTOProduct,Long> {
    @Query(value = "select * from tb_sentiment where idproduct = :idproduct", nativeQuery=true)
    List<DTOProduct> SearDTOProduct(@Param("idproduct") String idproduct);

    @Query(value = "select * from tb_sentiment where idproduct = :idproduct and titleProduct = :titleProduct", nativeQuery=true)
    List<DTOProduct> SearDTOProductName(@Param("titleProduct") String titleProduct,@Param("idproduct") String idproduct);
}
