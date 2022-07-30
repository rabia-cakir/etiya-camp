package com.kodlamaio.layeredarchitecture.business.concretes;

import com.kodlamaio.layeredarchitecture.business.abstracts.IEmployeeService;
import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.IEmployeeDal;
import com.kodlamaio.layeredarchitecture.entity.concretes.Employee;


import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements IEmployeeService {
    IEmployeeDal iEmployeeDal;
    public EmployeeManager(IEmployeeDal iEmployeeDal)
    {
        this.iEmployeeDal=iEmployeeDal;
    }
    @Override
    public List<Employee> getAll() {
        return iEmployeeDal.getAll();
    }
}
