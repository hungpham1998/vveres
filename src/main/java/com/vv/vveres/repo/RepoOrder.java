package com.vv.vveres.repo;

import com.vv.vveres.table.TbOrder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// author: tranducdang@gmail.com
public interface RepoOrder extends JpaRepository<TbOrder,Long>{
    List<TbOrder> findAllBy(Pageable pageable);
}
