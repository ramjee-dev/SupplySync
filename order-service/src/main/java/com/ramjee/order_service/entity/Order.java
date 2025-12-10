package com.ramjee.order_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@Entity@Table(name = "orders")
@Setter@Getter@Builder
@AllArgsConstructor@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Double totalAmount;
    private Instant createdAt;
    private Instant updatedAt;

}
