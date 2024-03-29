package demo.shopapi.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import demo.shopapi.entity.OrderMain;

/**
 * Created By Zhu Lin on 3/14/2018.
 */
public interface OrderRepository extends JpaRepository<OrderMain, Integer> {
    OrderMain findByOrderId(Long orderId);


    Page<OrderMain> findAllByOrderStatusOrderByCreateTimeDesc(Integer orderStatus, Pageable pageable);


    Page<OrderMain> findAllByBuyerEmailOrderByOrderStatusAscCreateTimeDesc(String buyerEmail, Pageable pageable);

    Page<OrderMain> findAllByOrderByOrderStatusAscCreateTimeDesc(Pageable pageable);

    Page<OrderMain> findAllByBuyerPhoneOrderByOrderStatusAscCreateTimeDesc(String buyerPhone, Pageable pageable);
}
