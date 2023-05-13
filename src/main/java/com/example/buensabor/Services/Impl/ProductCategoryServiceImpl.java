package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.FixedEntities.PaymentMethod;
import com.example.buensabor.Models.FixedEntities.ProductCategory;
import com.example.buensabor.Repositories.PaymentMethodRepository;
import com.example.buensabor.Repositories.ProductCategoryRepository;
import com.example.buensabor.Services.PaymentMethodService;
import com.example.buensabor.Services.ProductCategoryService;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl extends BaseServiceImpl<ProductCategory,Long> implements ProductCategoryService {

    private ProductCategoryRepository productCategoryRepository;

    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        super(productCategoryRepository);
        this.productCategoryRepository = productCategoryRepository;
    }

}
