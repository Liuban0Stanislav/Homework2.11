package com.internetshop.homework2_11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(scopeName = "prototype")
public class ShopService {
    private ShoppingCart shoppingCart;
    private Product product;

    public ShopService(ShoppingCart shoppingCart, Product product) {
        this.shoppingCart = shoppingCart;
        this.product = product;
    }

    public void add(String name, Double price) {
        Product product = new Product(name, price);
        shoppingCart.getChart().put(product.getId(), product);
    }

    public String get() {
        return shoppingCart.getChart().toString();
    }
}


