package com.in10se.poc.department.controller;

import com.in10se.poc.department.model.DepartmentEntity;
import com.in10se.poc.department.repositroy.IDepartmentRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    IDepartmentRepo departmentRepo;
    @PostMapping("/create")
    @ApiOperation(value = "department",produces = "application/json",consumes = "application/json",notes = "resource for creating department")
    public ResponseEntity<String>saveEmp(@RequestBody DepartmentEntity departmentEntity){
        DepartmentEntity departmentEntity1=departmentRepo.save(departmentEntity);
        return ResponseEntity.ok(departmentEntity1.getId()+"\t department created suceessfully");
    }
    @GetMapping("/getAllDept")
    @ApiOperation(value = "department",produces = "application/json",consumes = "application/json",notes = "rosource get all employee")
    public ResponseEntity<List<DepartmentEntity>>getAllDept(){
      List<DepartmentEntity>departmentEntityList=  departmentRepo.findAll();
      return ResponseEntity.ok(departmentEntityList);
    }
    @GetMapping("/getById/{id}")
    @ApiOperation(value = "get employee", notes = "get employee.", produces = "application/json", consumes = "application/json", response = DepartmentEntity.class)
    public ResponseEntity<Optional>getById(@PathVariable("id")String id){

        Optional<DepartmentEntity> employeeEntity= departmentRepo.findById(id);
        return ResponseEntity.ok(employeeEntity);
    }
}

