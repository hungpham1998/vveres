package com.vv.vveres.repo;

import com.vv.vveres.table.TbSentiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoSentiment extends JpaRepository<TbSentiment,Long> {
    List<TbSentiment> findByNamefile(String namefile);
}
