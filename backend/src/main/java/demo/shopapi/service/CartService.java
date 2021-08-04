package demo.shopapi.service;

import java.util.Collection;

import demo.shopapi.entity.Cart;
import demo.shopapi.entity.ProductInOrder;
import demo.shopapi.entity.User;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
