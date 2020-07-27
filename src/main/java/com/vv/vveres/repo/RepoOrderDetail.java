package com.vv.vveres.repo;

import com.vv.vveres.table.TbOrder;
import com.vv.vveres.table.TbOrderDetail;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// author: tranducdang@gmail.com
public interface RepoOrderDetail extends JpaRepository<TbOrderDetail,Long> {
    List<TbOrderDetail> findAllBy(Pageable pageable);
    List<TbOrderDetail> findAllByTbOrder(TbOrder tbOrder);
}
