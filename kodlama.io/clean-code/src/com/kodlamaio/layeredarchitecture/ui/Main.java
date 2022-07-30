package com.kodlamaio.layeredarchitecture.ui;

import com.kodlamaio.layeredarchitecture.business.abstracts.IEmployeeService;
import com.kodlamaio.layeredarchitecture.business.abstracts.IProductService;
import com.kodlamaio.layeredarchitecture.business.concretes.EmployeeManager;
import com.kodlamaio.layeredarchitecture.business.concretes.ProductManager;
import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.IProductDal;
import com.kodlamaio.layeredarchitecture.dataaccess.concretes.entityframework.EfEmployeeDal;
import com.kodlamaio.layeredarchitecture.dataaccess.concretes.entityframework.EfProductDal;

public class Main {
    public static void main(String[] args) {
        IEmployeeService iEmployeeService=new EmployeeManager(new EfEmployeeDal());
        iEmployeeService.getAll();

       IProductService iProductService =new ProductManager(new EfProductDal());
       iProductService.getAll();
    }
}
