package com.amanking.smelly.code;

public class InventoryAvailability {

    public static class Instance {
        public double fetchInventoryCount(String productId) {
            return InventoryAvailability.fetchInventoryCount(productId);
        }
    }

    public static double fetchInventoryCount(String productId) {
        return Math.random(); // Imagine this is real code that fetches from real DB
    }

}
