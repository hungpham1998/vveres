package com.vv.vveres.repo;

import com.vv.vveres.table.TbPreparationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPreparationDetail  extends JpaRepository<TbPreparationDetail,Long> {
}
