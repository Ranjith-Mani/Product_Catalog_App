package com.example.productcatalog.service;

//Imports
import com.example.productcatalog.model.Product;
import com.example.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//An annotation which is used to mark a class as a service provider
@Service

public class ProductService
{
    //An annotation to indicate which constructor spring should use for dependency injection
    @Autowired

    private ProductRepository productRepository;

    public void addProduct(Product product)
    {
        productRepository.save(product);
    }

    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category)
    {
        return productRepository.findByCategory(category);
    }
}
