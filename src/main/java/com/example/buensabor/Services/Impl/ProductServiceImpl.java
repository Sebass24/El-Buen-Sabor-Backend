package com.example.buensabor.Services.Impl;

import com.example.buensabor.Exceptions.ServiceException;
import com.example.buensabor.Models.Entity.Product;
import com.example.buensabor.Models.Entity.ProductDetail;
import com.example.buensabor.Models.FixedEntities.ProductCategory;
import com.example.buensabor.Repositories.ProductRepository;
import com.example.buensabor.Services.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product,Long> implements ProductService {

    private ProductRepository productRepository;
    private OrderDetailServiceImpl orderDetailService;
    private ProductDetailServiceImpl productDetailService;


    @Value("${product.profit}")
    private String profit;

    public ProductServiceImpl(ProductRepository productRepository, OrderDetailServiceImpl orderDetailService, ProductDetailServiceImpl productDetailService) {
        super(productRepository);
        this.productRepository = productRepository;
        this.orderDetailService = orderDetailService;
        this.productDetailService = productDetailService;
    }

    @Override
    @Transactional
    public Product save(Product entity) throws ServiceException {
        try {
            List<ProductDetail> productDetails = entity.getProductDetails();
            productDetails.forEach(productDetail -> {
                try {
                    productDetailService.save(productDetail);
                } catch (ServiceException e) {
                    e.printStackTrace();
                }
            });

            entity = baseRepository.save(entity);
            return entity;

        }catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }



    @Override
    public List<Product> getByCategory(String category) {
        return productRepository.getByCategory(category);
    }

    @Override
    public List<Product> getByName(String name) {
        return productRepository.getByName(name);
    }

    @Override
    public Map<String,Integer> getProductRanking(String category) {
        List<Product> products = getByCategory(category);
        Map<String,Integer> productRanking = new HashMap<>();
        products.stream().map(p ->
                productRanking.put(p.getName(), orderDetailService.countOrdersDetailByProduct(p.getId())));

        return productRanking;
    }

    @Override
    public List<Product> getBestSellersFromToByCategory(int top, ProductCategory category, Date from, Date to) {
        return null;
    }

    public double getProductCost(Product product){

        List<ProductDetail> pDetails = product.getProductDetails();
        Double subTotal = 0.;
        for (ProductDetail pd: pDetails) {
            subTotal += pd.getIngredient().getCostPrice() * pd.getQuantity();
        }
        return subTotal;
    }

    private double getProductSellPrice(Product product){

        List<ProductDetail> pDetails = product.getProductDetails();
        Double subTotal = 0.;
        for (ProductDetail pd: pDetails) {
            subTotal += pd.getIngredient().getCostPrice() * pd.getQuantity();
        }

        return (double) (Math.round(subTotal / 10.0) * 10) * Double.valueOf(profit);
    }

    @Override
    public void updatePrices() {
        List<Product> products = productRepository.findAll();

        for (Product prod: products) {
            prod.setSellPrice(getProductSellPrice(prod));
        }

    }

    @Override
    public List<Product> getRandom(int quantity) {
        List<Product> products = productRepository.getAvailable();
        Collections.shuffle(products);
        return products
                .stream()
                .distinct()
                .limit(quantity)
                .collect(Collectors.toList());
    }
}
