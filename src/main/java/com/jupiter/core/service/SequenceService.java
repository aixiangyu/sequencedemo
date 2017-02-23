package com.jupiter.core.service;

/**
 * Created by aixiangyu on 2017/2/23.
 */
public interface SequenceService {

    static final String USER = "t_user";

    int nextval(String tableName);
}
