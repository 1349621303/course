package com.course.server.service;

import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        TestExample testExample = new TestExample();

        // 相当于 where 查询语句
        testExample.createCriteria().andIdEqualTo("1");
        // 这种方式是降序排序
        // testExample.setOrderByClause("id desc");


        return testMapper.selectByExample(testExample);
    }
}
