package com.internetshop.homework2_11;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Integer, Product> chart = new HashMap<>();

    public Map<Integer, Product> getChart() {
        return chart;
    }

    public void setChart(Map<Integer, Product> chart) {
        this.chart = chart;
    }
}
