package com.catalog.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.catalog.dto.ProductRequestDTO;
import com.catalog.dto.ProductResponseDTO;
import com.catalog.entity.Product;

public class ProductMapper {
    
    public static Product toEntity(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        return product;
    }
    
    public static ProductResponseDTO toDTO(Product entity) {
        return new ProductResponseDTO(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPrice(),
            entity.getStock()
        );
    }
    
    public static List<ProductResponseDTO> toDTOList(List<Product> products) {
        return products.stream()
            .map(ProductMapper::toDTO)
            .collect(Collectors.toList());
    }
}