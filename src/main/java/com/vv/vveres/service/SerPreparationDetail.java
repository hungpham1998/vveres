package com.vv.vveres.service;

import com.vv.vveres.table.TbPreparationDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Authen: Hungrost@gamil.com
@Service
public class SerPreparationDetail {

    @Autowired
    com.vv.vveres.repo.RepoPreparationDetail repoPreparationDetail;

    public List<TbPreparationDetail> getAll() {
        return repoPreparationDetail.findAll();
    }

    public Optional<TbPreparationDetail> getById(Long id){
        return  repoPreparationDetail.findById(id);
    }

    public Page<TbPreparationDetail> getPage(Pageable pageable){
        return repoPreparationDetail.findAll(pageable);
    }

    public TbPreparationDetail insSent(TbPreparationDetail preparationDetail){
        return  repoPreparationDetail.save(preparationDetail);
    }

    public  TbPreparationDetail updateSent(TbPreparationDetail preparationDetail){
        return  repoPreparationDetail.save(preparationDetail);
    }

    public  void delete(Long id){
        repoPreparationDetail.deleteById(id);
    }
}
