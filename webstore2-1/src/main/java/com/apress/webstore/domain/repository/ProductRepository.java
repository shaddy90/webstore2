package com.apress.webstore.domain.repository;

import java.util.List;

import com.apress.webstore.domain.Product; 

public interface ProductRepository { 

   List <Product> getAllProducts(); 
} 