package com.apress.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apress.webstore.domain.Product;

@Controller
public class ProductController {

	
	@RequestMapping("/products")
	public String list(Model model) {
		
		Product product = new Product();
		
		product.setProductId("P1234");
		product.setName("IPhoen 6s");
		product.setUnitPrice(new BigDecimal(500));
		product.setDescription("Apple iPhone 6s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera"); 
		product.setCategory("Smartphone"); 
		product.setManufacturer("Apple"); 
		product.setUnitsInStock(1000);
		
		model.addAttribute("product", product);
		
		return "products";
	}
}
