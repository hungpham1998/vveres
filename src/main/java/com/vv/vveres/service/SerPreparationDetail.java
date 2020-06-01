package com.vv.vveres.service;

import com.vv.vveres.table.TbPreparationDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerPreparationDetail {

    @Autowired
    com.vv.vveres.repo.RepoPreparationDetail repoPreparationDetail;

    public List<TbPreparationDetail> getAll() {
        return repoPreparationDetail.findAll();
    }

    public Optional<TbPreparationDetail> getById(Long Id){
        return  repoPreparationDetail.findById(Id);
    }

    public TbPreparationDetail insSent(TbPreparationDetail preparationDetail){
        return  repoPreparationDetail.save(preparationDetail);
    }

    public  TbPreparationDetail updateSent(TbPreparationDetail preparationDetail){
        return  repoPreparationDetail.save(preparationDetail);
    }

    public  void delete(Long Id){
        repoPreparationDetail.deleteById(Id);
    }
}
