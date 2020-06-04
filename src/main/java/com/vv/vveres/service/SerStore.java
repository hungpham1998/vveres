package com.vv.vveres.service;

import com.vv.vveres.table.TbSalaryCode;
import com.vv.vveres.table.TbStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerStore {
    @Autowired
    com.vv.vveres.repo.RepoStore repoStore;
    public Page<TbStore> GetAll(Pageable pageable) {
        return repoStore.findAll(pageable);
    }
    public Optional<TbStore> FindById(long id) {
        return repoStore.findById(id);
    }
    public List<TbStore> FindByTitle(String title) {
        return repoStore.findByTitle(title);
    }


    public TbStore InsSent(TbStore input){
        return repoStore.save(input);
    }
    public void Delete (long Id){
        repoStore.deleteById(Id);
    }
}
