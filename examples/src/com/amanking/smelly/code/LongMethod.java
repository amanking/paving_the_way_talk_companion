package com.amanking.smelly.code;

public class LongMethod {

    private boolean forcePreOrder;

    public String fetchProductAvailability(String productName) {
        String availability = "";
        // ...
        // LOTS of code...

        if ((productName.endsWith("Tab 11") && productName.startsWith("Galaxy"))
                || productName.contains("PRE-ORDER") || forcePreOrder) {
            availability += "Pre-Order Only";
        }

        // LOTS of code...
        // ...

        return availability;
    }

    public void setForcePreOrder(boolean forcePreOrder) {
        this.forcePreOrder = forcePreOrder;
    }
}
