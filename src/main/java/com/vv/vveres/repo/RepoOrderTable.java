package com.vv.vveres.repo;

import com.vv.vveres.table.TbOrderTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoOrderTable extends JpaRepository<TbOrderTable,Long> {
List<TbOrderTable>  getByTitle(String title);
}
