package com.amanking.smelly.code;

public class StaticMethodCall {

    public String fetchInventoryFor(String productId) {
        double inventoryCount = inventoryAvailability().fetchInventoryCount(productId);
        if (inventoryCount > 0) {
            return "AVAILABLE";
        } else {
            return "OUT OF STOCK";
        }
    }

    InventoryAvailability.Instance inventoryAvailability() {
        return new InventoryAvailability.Instance();
    }

}
