package com.kodlamaio.layeredarchitecture.business.abstracts;

import com.kodlamaio.layeredarchitecture.entity.concretes.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
}
