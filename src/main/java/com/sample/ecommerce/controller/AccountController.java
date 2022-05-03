package com.sample.ecommerce.controller;

import com.sample.ecommerce.model.Account;
import com.sample.ecommerce.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/test")
    public Mono test(){
        System.out.println("Testing");
        return Mono.just("Testing");
    }

    @PostMapping("/create")
    public Mono CreateAccount(Account account){
        return accountService.CreateAccount(account);
    }

    @GetMapping("getAll")
    public Flux<Account> GetAllAccounts(){
        return accountService.GetAllAccounts();
    }
}


