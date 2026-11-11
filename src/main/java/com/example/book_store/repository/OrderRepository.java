package com.example.book_store.repository;

import com.example.book_store.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByMemberId(Long memberId);

    List<Order> findByStatus(Order.OrderStatus status);
}
