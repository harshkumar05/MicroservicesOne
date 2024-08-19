package com.msone.department_svc.controller;

import com.msone.department_svc.model.Department;
import com.msone.department_svc.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping("/add")
    public Department add(@RequestBody Department department) {
        return departmentRepo.addDepartment(department);
    }

    @GetMapping("/get")
    public List<Department> findAll() {
        return departmentRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentRepo.findById(id);
    }
}
