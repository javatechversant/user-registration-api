/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.controller;
import com.product.service.IProductService;
import com.product.model.Product;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  



@RestController  
public class ProductController   
{  
@Autowired  
private IProductService productService;  



//mapping the getProduct() method to /product  



@GetMapping(value = "/product")  
public List<Product> getProduct()   
{  
//finds all the products  
List<Product> products = productService.findAll();  
//returns the product list  
return products;  
}  
}  