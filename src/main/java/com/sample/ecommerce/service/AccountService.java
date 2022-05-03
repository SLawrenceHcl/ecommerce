package com.sample.ecommerce.service;

import com.sample.ecommerce.model.Account;
import com.sample.ecommerce.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Mono<Account> CreateAccount(Account account){
        return accountRepository.save(account);
    }

    public Flux<Account> GetAllAccounts(){
        return accountRepository.findAll();
    }

    public Mono<Account> UpdateAccount(String AccountId, Account account){
        Mono<Account> temp = accountRepository.findById(AccountId);
            temp.map((c) -> {
                c.setUserName(account.getUserName());
                c.setShopping_cart(account.getShopping_cart());
                return c;
            }).flatMap(c -> accountRepository.save(c));
        return temp;

    }


}
