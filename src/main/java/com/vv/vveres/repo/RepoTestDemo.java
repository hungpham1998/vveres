package com.vv.vveres.repo;

import com.vv.vveres.table.TbTestDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface RepoTestDemo extends JpaRepository<TbTestDemo,Long>
{
        List<TbTestDemo> findByTitle(String title);
        List<TbTestDemo>  findAll();
        Optional<TbTestDemo> findById(Long id);
}
