package com.tokenportal.tokenportal.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@Document(collection = "purchases")
public class Purchase extends Bargain{
    
    private String paymentMethod;
}
