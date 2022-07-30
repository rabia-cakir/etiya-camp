package com.kodlamaio.layeredarchitecture.dataaccess.abstracts;
import com.kodlamaio.layeredarchitecture.entity.concretes.Product;

import java.util.List;

public interface IProductDal {
    List<Product> getAll();
}
