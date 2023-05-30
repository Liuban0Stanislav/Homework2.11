package com.internetshop.homework2_11;

import org.springframework.stereotype.Service;

@Service
public class ShopService {
    ShoppingCart shoppingCart = new ShoppingCart();

    public void add(String name, double price) {
        Product product = new Product(name, price);
        shoppingCart.getChart().put(product.getId(), product);
    }

    public String get() {
        return shoppingCart.getChart().toString();
    }
}
