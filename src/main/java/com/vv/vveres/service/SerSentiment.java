package com.vv.vveres.service;

import com.vv.vveres.table.TbSentiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerSentiment {
    @Autowired
    com.vv.vveres.repo.RepoSentiment repoSentiment;
    public List<TbSentiment> FindByNameFile(String namefile) {
        return repoSentiment.SearchSentimentByNameFile(namefile);
    }
    public List<TbSentiment> FindAllSentiment(){
        return repoSentiment.findAll();
    }

    public Page<TbSentiment> FindAllSentiment2(Pageable pageable){
        return repoSentiment.findAll(pageable);
    }

    public int DeleteAll(){
        try{
            repoSentiment.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
    public TbSentiment InsSent(TbSentiment _input){
        return repoSentiment.save(_input);
    }
}
