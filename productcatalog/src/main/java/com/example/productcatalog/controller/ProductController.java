package com.example.productcatalog.controller;

//Imports
import com.example.productcatalog.model.Product;
import com.example.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

//An annotation is used to define an entrance point for spring web application
@Controller

public class ProductController
{
    //An annotation to indicate which constructor spring should use for dependency injection
    @Autowired

    private ProductService productService;

    //An annotation to mapping HTTP GET request onto specific handler methods
    @GetMapping("/")

    public String index()
    {
        return "index";
    }

    @GetMapping("/addProduct")
    public String addProductForm(Model model)
    {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    //An annotation to mapping HTTP POST request onto specific handler methods
    @PostMapping("/addProduct")

    public String addProduct(@ModelAttribute Product product)
    {
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/displayProducts")
    public String displayProducts(Model model)
    {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "displayProducts";
    }
}

//@ModelAttribute annotation is used to share default data