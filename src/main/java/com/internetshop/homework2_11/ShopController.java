package com.internetshop.homework2_11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    private final ShopService shopService;
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }
    @GetMapping("/add")
    public String add(@RequestParam ("name") String name, @RequestParam("price") double price){
        shopService.add(name, price);
        return "товар добавлен";
    }

    @GetMapping("/get")
    public String get(){
        return shopService.get();
    }
}
