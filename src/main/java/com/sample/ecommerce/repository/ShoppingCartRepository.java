package com.sample.ecommerce.repository;

import com.sample.ecommerce.model.ShoppingCart;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ShoppingCartRepository extends ReactiveMongoRepository<ShoppingCart, String> {
}
