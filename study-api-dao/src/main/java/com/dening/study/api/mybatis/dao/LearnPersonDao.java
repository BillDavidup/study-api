package com.dening.study.api.mybatis.dao;

import com.dening.study.api.mybatis.dao.model.LearnPersonModel;

public interface LearnPersonDao {
    int deleteByPrimaryKey(Long id);

    int insert(LearnPersonModel record);

    int insertSelective(LearnPersonModel record);

    LearnPersonModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LearnPersonModel record);

    int updateByPrimaryKey(LearnPersonModel record);
}