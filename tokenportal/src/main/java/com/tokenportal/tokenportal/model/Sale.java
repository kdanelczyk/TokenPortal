package com.tokenportal.tokenportal.model;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@Document(collection = "sales")
public class Sale extends Bargain{
    
    private BigDecimal transactionFee;
}
