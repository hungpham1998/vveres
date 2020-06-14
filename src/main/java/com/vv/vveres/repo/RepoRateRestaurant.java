package com.vv.vveres.repo;
import com.vv.vveres.table.TbRateRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Repository
public interface RepoRateRestaurant extends JpaRepository<TbRateRestaurant,Long>{
    Optional<TbRateRestaurant> findById(Long id);
}

