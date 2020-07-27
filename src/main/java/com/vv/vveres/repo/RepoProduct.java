package com.vv.vveres.repo;



import com.vv.vveres.table.TbProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Repository
public interface RepoProduct extends JpaRepository<TbProduct,Long> {
    Optional<TbProduct> findById(Long id);
    List<TbProduct> findByTitle(String title);
    Page<TbProduct> findByTitle(String title, Pageable pageable);

    List<TbProduct> findAllBy(Pageable pageable);

}

