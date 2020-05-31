package com.vv.vveres.repo;

import com.vv.vveres.table.TbInvertory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoInvertory extends JpaRepository<TbInvertory,Long> {


}
