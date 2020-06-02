package com.vv.vveres.repo;

import com.vv.vveres.table.TbLossProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoLossProduct  extends JpaRepository<TbLossProduct,Long> {

   // List<TbLossProduct> findByLossDate(Date lossDate);

}
