package com.amanking.smelly.code;

public class StaticMethodCall {

    public String fetchInventoryFor(String productId) {
        double inventoryCount = InventoryAvailability.fetchInventoryCount(productId);
        if (inventoryCount > 0) {
            return "AVAILABLE";
        } else {
            return "OUT OF STOCK";
        }
    }

}
