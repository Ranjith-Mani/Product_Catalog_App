package com.example.productcatalog.repository;

//Imports
import com.example.productcatalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

//An annotation which helps to easily use CRUD operations in the database
@Repository

public interface ProductRepository extends JpaRepository<Product, Long>
{
    List<Product> findByCategory(String category);
}
