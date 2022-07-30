package com.kodlamaio.layeredarchitecture.business.concretes;

import com.kodlamaio.layeredarchitecture.business.abstracts.IProductService;
import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.IProductDal;
import com.kodlamaio.layeredarchitecture.entity.concretes.Product;


import java.util.List;

public class ProductManager implements IProductService {

    IProductDal iProductDal;
    public ProductManager(IProductDal iProductDal)
    {
        this.iProductDal=iProductDal;
    }

    @Override
    public List<Product> getAll() {
        return iProductDal.getAll();
    }
}
