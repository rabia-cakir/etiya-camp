package com.kodlamaio.layeredarchitecture.business.abstracts;



import com.kodlamaio.layeredarchitecture.entity.concretes.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
}
