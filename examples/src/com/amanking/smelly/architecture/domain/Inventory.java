package com.amanking.smelly.architecture.domain;

public class Inventory {
    private double inventoryCount;
    private InventoryType type;

    public double getInventoryCount() {
        return inventoryCount;
    }

    public InventoryType getType() {
        return type;
    }

    public boolean isAvailable() {
        return inventoryCount > 0 || type.equals(InventoryType.INFINITE);
    }
}
