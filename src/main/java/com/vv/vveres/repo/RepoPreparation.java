package com.vv.vveres.repo;


import com.vv.vveres.table.TbPreparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPreparation extends JpaRepository<TbPreparation,Long> {
}
