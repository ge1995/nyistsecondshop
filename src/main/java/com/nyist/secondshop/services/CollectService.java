package com.nyist.secondshop.services;

import com.nyist.secondshop.mappers.CollectMapper;
import com.nyist.secondshop.models.Collect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chao on 2018/5/14.
 */
@Service
public class CollectService {
    @Autowired
    private CollectMapper collectMapper;

    @Transactional
    public Boolean deleteCollect(Integer collectId){
        return collectMapper.deleteCollect(collectId) > 0;
    }

    @Transactional
    public Boolean getCollect(Integer goodId, Integer userId){
        return collectMapper.getCollect(goodId, userId) != null;
    }

    @Transactional
    public List<Collect> getCollectByUserId(Integer userId){
        return collectMapper.getCollectByUserId(userId);
    }

    @Transactional
    public Boolean insertCollect(Collect collect){
        return collectMapper.insertCollect(collect) > 0;
    }
}
