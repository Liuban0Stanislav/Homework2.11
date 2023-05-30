package com.internetshop.homework2_11;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = id + 1;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": id=" + id + " цена - " + price + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
