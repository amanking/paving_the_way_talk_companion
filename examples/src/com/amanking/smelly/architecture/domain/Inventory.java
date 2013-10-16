package com.amanking.smelly.architecture.domain;

import com.sun.tools.internal.xjc.util.Util;

public class Inventory {
    private double inventoryCount;
    private InventoryType type;

    public double getInventoryCount() {
        return inventoryCount;
    }

    public InventoryType getType() {
        return type;
    }
}
