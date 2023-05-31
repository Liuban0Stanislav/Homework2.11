package com.internetshop.homework2_11;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;

@Component
@Configuration
public class ShoppingCart {
    private Map<Integer, Product> chart = new HashMap<>();

    public Map<Integer, Product> getChart() {
        return chart;
    }
//    @PostConstruct
//    public void init(){
//        chart.put(Product.getId(), new Product("шарикоподшипник 10х17х5", 155));
//        chart.put(Product.getId(), new Product("шарикоподшипник 12х18х6", 172));
//        chart.put(Product.getId(), new Product("шарикоподшипник 15х22х10", 210));
//        chart.put(Product.getId(), new Product("шарикоподшипник 18х32х12", 530));
//        chart.put(Product.getId(), new Product("шарикоподшипник 22х40х16", 680));
//    }
}

