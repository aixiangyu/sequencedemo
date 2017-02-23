package com.jupiter.core.service.impl;

import com.jupiter.core.dao.SequenceDao;
import com.jupiter.core.service.SequenceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by aixiangyu on 2017/2/23.
 */
@Service("sequenceService")
public class SequenceServiceImpl implements SequenceService{

    @Resource
    private SequenceDao sequenceDao;

    @Override
    public int nextval(String tableName) {
        return sequenceDao.nextval(tableName);
    }
}
