package com.vv.vveres.repo;

import com.vv.vveres.table.TbStore;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Repository
public interface RepoStore extends JpaRepository<TbStore,Long>{
    Optional<TbStore> findById(Long id);
    List<TbStore> findByTitle(String title);
    Page<TbStore> findByTitle(String title, Pageable pageable);

}

