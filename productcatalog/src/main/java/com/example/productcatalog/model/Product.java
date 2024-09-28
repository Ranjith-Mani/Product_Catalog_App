package com.example.productcatalog.model;

//Imports
import jakarta.persistence.*;

//An annotation which is used to denote the creation tables
@Entity

//An annotation which is used to specify the details of the database table
@Table(name = "products")

public class Product
{
    //An annotation which is used to denote PRIMARY KEY
    @Id

    //An annotation which is used to designate how an entity's unique ID value will be generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double price;
    private String category;

    // Getters and Setters
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }
}
