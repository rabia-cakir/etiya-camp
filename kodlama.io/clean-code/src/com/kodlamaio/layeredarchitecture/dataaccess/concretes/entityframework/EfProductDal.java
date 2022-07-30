package com.kodlamaio.layeredarchitecture.dataaccess.concretes.entityframework;

import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.IProductDal;
import com.kodlamaio.layeredarchitecture.entity.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class EfProductDal implements IProductDal {
    @Override
    public List<Product> getAll() {
        return new ArrayList<>();
    }
}
