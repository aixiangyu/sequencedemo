package com.jupiter.test;

import com.jupiter.core.service.SequenceService;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by aixiangyu on 2017/2/23.
 */
@ContextConfiguration("classpath:sequence-spring.xml")
public class SequenceTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private SequenceService sequenceService;

    @Test
    public void test(){
        for (int i=0; i<10; i++){
            System.out.println("seq:"+sequenceService.nextval(SequenceService.USER));
        }
    }
}
