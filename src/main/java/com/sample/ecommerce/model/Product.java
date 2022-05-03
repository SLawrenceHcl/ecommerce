package com.sample.ecommerce.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("Product")
public class Product {
    private String ProductId;
    private Integer Stock;
    private String Discount;
    private Float BasePrice;
    private Float FinalPrice;
}
