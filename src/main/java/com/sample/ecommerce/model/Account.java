package com.sample.ecommerce.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("Account")
public class Account {
    @Id
    private String AccountId;
    private String UserName;
    private ShoppingCart shopping_cart;
}
