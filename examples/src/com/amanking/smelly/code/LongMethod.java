package com.amanking.smelly.code;

public class LongMethod {

    private boolean forcePreOrder;

    public String fetchProductAvailability(String productName) {
        String availability = "";
        // ...
        // LOTS of code...

        if (isPreOrder(productName)) {
            availability += "Pre-Order Only";
        }

        // LOTS of code...
        // ...

        return availability;
    }

    boolean isPreOrder(String productName) {
        boolean isGalaxyTab11 = productName.endsWith("Tab 11") && productName.startsWith("Galaxy");
        return isGalaxyTab11 || productName.contains("PRE-ORDER") || forcePreOrder;
    }

    public void setForcePreOrder(boolean forcePreOrder) {
        this.forcePreOrder = forcePreOrder;
    }
}
