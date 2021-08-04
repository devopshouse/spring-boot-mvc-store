package demo.shopapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.shopapi.entity.Cart;

/**
 * Created By Zhu Lin on 1/2/2019.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
