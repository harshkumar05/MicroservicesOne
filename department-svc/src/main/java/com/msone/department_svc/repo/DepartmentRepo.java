package com.msone.department_svc.repo;

import com.msone.department_svc.model.Department;
import jakarta.ws.rs.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepo {
    private List<Department> departmentList=new ArrayList<>();
    public Department addDepartment(Department department){
        departmentList.add(department);
        return department;
    }
    public Department findById(long id){
        return departmentList.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow(NotFoundException::new);
    }
    public List<Department> findAll(){
        return departmentList;
    }
}
