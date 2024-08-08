package com.tokenportal.tokenportal.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "bargains")
public abstract class Bargain {
    
     @Id
    private String id;

    private BigDecimal amount;
    private BigDecimal price;
    private LocalDateTime timestamp;

    private String clientLogin; // Login klienta
    private String clientEmail; // Email klienta
}
