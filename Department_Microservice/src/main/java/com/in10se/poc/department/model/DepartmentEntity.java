package com.in10se.poc.department.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document("department")
public class DepartmentEntity {
    protected String id= UUID.randomUUID().toString();
    protected String empDept;
    protected String empDesg;
    protected String address;
    protected String ename;

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "deptId='" + id + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empDesg='" + empDesg + '\'' +
                ", address='" + address + '\'' +
                ", ename='" + ename + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String deptId) {
        this.id = UUID.randomUUID().toString();
    }

    public String getEmpDesg() {
        return empDesg;
    }

    public void setEmpDesg(String empDesg) {
        this.empDesg = empDesg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(empDept, that.empDept) &&
                Objects.equals(empDesg, that.empDesg) &&
                Objects.equals(address, that.address) &&
                Objects.equals(ename, that.ename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empDept, empDesg, address, ename);
    }
}
