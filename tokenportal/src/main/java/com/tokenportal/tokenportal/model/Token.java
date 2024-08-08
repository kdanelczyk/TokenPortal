package com.tokenportal.tokenportal.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "tokens")
public class Token {
    
    @Id
    private String id;

    private String symbol;
    private String name;
    private String description;
    private BigDecimal currentPrice;
    private BigDecimal totalSupply;
    private BigDecimal circulatingSupply;
    private LocalDateTime createdAt;

    @DBRef
    private List<Bargain> bargains;
}
