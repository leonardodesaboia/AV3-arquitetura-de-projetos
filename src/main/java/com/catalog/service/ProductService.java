package com.catalog.service;

import java.util.List;
import com.catalog.dto.ProductRequestDTO;
import com.catalog.dto.ProductResponseDTO;

public interface ProductService {
    ProductResponseDTO updateStock(Long id, Integer quantity);
    ProductResponseDTO createProduct(ProductRequestDTO requestDTO);
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO getProductById(Long id);
    ProductResponseDTO updateProduct(Long id, ProductRequestDTO requestDTO);
    void deleteProduct(Long id);
}