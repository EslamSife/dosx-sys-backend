package com.dosx.sys.com.dosx.sys.dao;

import com.dosx.sys.com.dosx.sys.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "employee", path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    // push to github
}
