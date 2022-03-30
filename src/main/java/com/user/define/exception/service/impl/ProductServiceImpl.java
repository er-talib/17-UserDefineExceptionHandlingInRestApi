package com.user.define.exception.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.user.define.exception.entities.Product;
import com.user.define.exception.service.ProductService;
import com.user.define.exception.userdefine.exception.ProductNotFoundException;
@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product findProductById(long id) {

		if (id == 101) {
			return new Product(101, "Car", "405000", new Date());
		} else {
			throw new ProductNotFoundException("Product not found.");
		}

	}

}
