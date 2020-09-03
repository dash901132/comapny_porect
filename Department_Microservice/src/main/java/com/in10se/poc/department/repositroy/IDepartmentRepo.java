package com.in10se.poc.department.repositroy;

import com.in10se.poc.department.model.DepartmentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IDepartmentRepo  extends MongoRepository<DepartmentEntity,String> {
}
