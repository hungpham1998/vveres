package com.vv.vveres.repo;

import com.vv.vveres.table.TbStore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepoStore extends JpaRepository<TbStore,Long>{


    List<TbStore> findByTitle(String Title);

    Optional<TbStore> findById(Long Id);


    void deleteById(TbStore Id);

    Optional<TbStore> findById(long id);

}
