package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Product;
import com.example.buensabor.Repositories.ProductRepository;
import com.example.buensabor.Services.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product,Long> implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

}
