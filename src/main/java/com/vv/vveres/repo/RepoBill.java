package com.vv.vveres.repo;

import com.vv.vveres.table.TbBill;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RepoBill extends JpaRepository<TbBill,Long>
{
    List<TbBill>findByTitle(String title);
}
