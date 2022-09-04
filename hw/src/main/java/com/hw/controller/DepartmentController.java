package com.hw.controller;

import com.hw.pojo.Department;
import com.hw.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/getAll")
    public List<Department> getall(){
        return departmentService.getAll();
    }
}
