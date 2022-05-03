package com.sample.ecommerce.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("ShoppingCart")
public class ShoppingCart {
    private String AccountId;
    private String ProductId;
    private Integer Quantity;
}
