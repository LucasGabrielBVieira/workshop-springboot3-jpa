package com.educandoweb.webservice.repositories;

import com.educandoweb.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
