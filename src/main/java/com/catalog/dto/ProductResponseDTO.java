package com.catalog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDTO {
    
    private Long id;
    
    private String name;
    
    private String description;
    
    private Double price;
    
    private Integer stock;
}