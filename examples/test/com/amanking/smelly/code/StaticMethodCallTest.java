package com.amanking.smelly.code;

import junit.framework.Assert;
import org.junit.Test;

public class StaticMethodCallTest {

    @Test
    public void shouldReturnAvailableWhenInventoryCountIsGreaterThanZero() {
        InventoryAvailability.Instance inventoryAvailability = new InventoryAvailabilityTestDouble(99);
        StaticMethodCall code = new StaticMethodCallTestDouble(inventoryAvailability);
        Assert.assertEquals("AVAILABLE", code.fetchInventoryFor("123456"));
    }

    @Test
    public void shouldReturnOutOfStockWhenInventoryCountIsZero() {
        InventoryAvailability.Instance inventoryAvailability = new InventoryAvailabilityTestDouble(0);
        StaticMethodCall code = new StaticMethodCallTestDouble(inventoryAvailability);
        Assert.assertEquals("OUT OF STOCK", code.fetchInventoryFor("123456"));
    }

    static class StaticMethodCallTestDouble extends StaticMethodCall {
        private InventoryAvailability.Instance inventoryAvailability;

        private StaticMethodCallTestDouble(InventoryAvailability.Instance inventoryAvailability) {
            this.inventoryAvailability = inventoryAvailability;
        }

        @Override
        InventoryAvailability.Instance inventoryAvailability() {
            return inventoryAvailability;
        }
    }

    static class InventoryAvailabilityTestDouble extends InventoryAvailability.Instance {
        private double fakeInventoryCount;

        public InventoryAvailabilityTestDouble(double fakeInventoryCount) {
            this.fakeInventoryCount = fakeInventoryCount;
        }

        @Override
        public double fetchInventoryCount(String productId) {
            return fakeInventoryCount;
        }
    }
}
