package com.example.ecommerce.dto;

import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {
    private Long id;
    private Long productId;
    @Positive
    private Integer quantity;
    @Positive
    private BigDecimal price;
}