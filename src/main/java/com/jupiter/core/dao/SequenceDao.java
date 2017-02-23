package com.jupiter.core.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by aixiangyu on 2017/2/23.
 */
@Repository("sequenceDao")
public interface SequenceDao {


    int nextval(@Param("tableName") String tableName);
}
