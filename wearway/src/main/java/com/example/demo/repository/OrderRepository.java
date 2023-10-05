package com.example.demo.repository;

import com.example.demo.entity.OrderTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderTotal, Long> {

}
