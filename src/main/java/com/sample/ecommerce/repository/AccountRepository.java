package com.sample.ecommerce.repository;

import com.sample.ecommerce.model.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
