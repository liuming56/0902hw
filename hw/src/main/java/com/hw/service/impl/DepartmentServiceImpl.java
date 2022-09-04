package com.hw.service.impl;

import com.hw.mapper.DepartmentMapper;
import com.hw.pojo.Department;
import com.hw.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getAll() {
        return departmentMapper.selectList(null);
    }
}
