package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Product;
import com.example.buensabor.Models.Enum.ProductCategory;
import com.example.buensabor.Repositories.ProductRepository;
import com.example.buensabor.Services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product,Long> implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getByCategory(String category) {
        return productRepository.findAll().stream().filter(prod -> prod.getProductCategory()
                    .toString()
                    .equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getByName(String name) {
        return productRepository.findAll().stream().filter(prod -> prod.getName()
                        .equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getBestSellersAllTimesByCategory(int top, ProductCategory category) {
        return null;
    }

    @Override
    public List<Product> getBestSellersFromToByCategory(int top, ProductCategory category, Date from, Date to) {
        return null;
    }
}
