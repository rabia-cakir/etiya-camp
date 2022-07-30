package com.kodlamaio.layeredarchitecture.dataaccess.abstracts;

import com.kodlamaio.layeredarchitecture.entity.concretes.Employee;

import java.util.List;

public interface IEmployeeDal {
    List<Employee> getAll();
}
