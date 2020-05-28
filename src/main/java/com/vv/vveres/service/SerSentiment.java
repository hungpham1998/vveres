package com.vv.vveres.service;

import com.vv.vveres.table.TbSentiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerSentiment {
    @Autowired
    com.vv.vveres.repo.RepoSentiment repoSentiment;
    public List<TbSentiment> FindByNameFile(String namefile) {
        return repoSentiment.findByNamefile(namefile);
    }

    public TbSentiment InsSent(TbSentiment _input){
        return repoSentiment.save(_input);
    }
}
