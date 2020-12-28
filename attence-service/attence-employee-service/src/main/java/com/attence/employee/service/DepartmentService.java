package com.attence.employee.service;

import com.attence.employee.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@CacheConfig(cacheNames = "department")
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Cacheable
    public Map<String, String> getDepartmentData() {
        Map<String, String> departmentData = new HashMap<String, String>();
        departmentMapper.selectByExample(null).forEach(department -> {
            departmentData.put(department.getId(), department.getName());
        });
        return departmentData;
    }
}
