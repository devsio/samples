package io.devs.spring.mvcdemo.services;

import io.devs.spring.mvcdemo.model.Product;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private static Map<String, Product> products = new HashMap<String, Product>();
	static {
		products.put("p1", new Product("p1"));
		products.put("p2", new Product("p2"));
		products.put("p3", new Product("p3"));
	}
	
	public List<Product> getProducts() {
		return new LinkedList<Product>(products.values());
	}

	public Product getProduct(String name) {
		return products.get(name);
	}

}
