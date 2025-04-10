package com.microservices.bookstore.orders.domain.models;

public enum OrderStatus {
    NEW,
    IN_PROCESS,
    DELIVERED,
    CANCELLED,
    ERROR
}
