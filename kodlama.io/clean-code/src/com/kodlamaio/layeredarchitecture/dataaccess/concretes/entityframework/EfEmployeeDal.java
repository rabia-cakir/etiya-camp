package com.kodlamaio.layeredarchitecture.dataaccess.concretes.entityframework;

import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.IEmployeeDal;
import com.kodlamaio.layeredarchitecture.entity.concretes.Employee;

import java.util.ArrayList;
import java.util.List;

public class EfEmployeeDal implements IEmployeeDal {
    @Override
    public List<Employee> getAll() {
        return new ArrayList<>();
    }
}
