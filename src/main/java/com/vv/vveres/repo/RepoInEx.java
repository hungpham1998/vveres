package com.vv.vveres.repo;


import com.vv.vveres.table.TbInEx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoInEx extends JpaRepository<TbInEx,Long> {
   //List<TbInEx> findByTitle(String title);

    // List<TbInEx> findByInEx(String inEx);

}
