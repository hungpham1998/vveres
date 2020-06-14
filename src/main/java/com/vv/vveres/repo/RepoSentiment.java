package com.vv.vveres.repo;


import com.vv.vveres.table.TbSentiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoSentiment extends JpaRepository<TbSentiment,Long> {
    ///---
    @Query(value = "select * from tb_sentiment where namefile = :namefile", nativeQuery=true)
    List<TbSentiment> SearchSentimentByNameFile(@Param("namefile") String namefile);
    //-- framework
    List<TbSentiment> findByNamefile(String namefile);
}
