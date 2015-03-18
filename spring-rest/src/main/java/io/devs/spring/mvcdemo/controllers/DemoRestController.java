package io.devs.spring.mvcdemo.controllers;

import io.devs.spring.mvcdemo.model.Product;
import io.devs.spring.mvcdemo.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="rest")
public class DemoRestController {

	@Autowired
	private ProductService ps;

	@RequestMapping(value = "products")
	public List<Product> getProducts() {
		List<Product> products = ps.getProducts();
		return products;
	}

	@RequestMapping(value = "product/{name}")
	public Product getProduct(@PathVariable(value = "name") String name) {
		Product product = ps.getProduct(name);
		return product;
	}

}