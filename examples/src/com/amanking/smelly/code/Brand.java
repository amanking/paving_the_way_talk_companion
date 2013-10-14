package com.amanking.smelly.code;

import java.util.Arrays;
import java.util.List;

public enum Brand {
    NOKIA("lumia") {
        @Override
        public String typeOf(Product product) {
            return "mobile";
        }
    },
    APPLE("ipad", "iphone") {
        @Override
        public String typeOf(Product product) {
            return product.matches("ipad") ? "tablet" : "mobile";
        }
    },
    SAMSUNG("galaxy") {
        @Override
        public String typeOf(Product product) {
            return product.matches("tab") ? "tablet" : "mobile";
        }
    },
    GOOGLE("nexus") {
        @Override
        public String typeOf(Product product) {
            return product.matches("nexus 7") ? "tablet" : "mobile";
        }
    },
    UNKNOWN() {
        @Override
        public String lowerCaseName() {
            return "";
        }

        @Override
        public String typeOf(Product product) {
            return "";
        }
    };

    private List<String> productNames;

    Brand(String... productNames) {
        this.productNames = Arrays.asList(productNames);
    }

    public boolean isManufacturerOf(Product product) {
        for (String productName : productNames) {
            if (product.matches(productName)) {
                return true;
            }
        }
        return false;
    }

    public String lowerCaseName() {
        return toString().toLowerCase();
    }

    public abstract String typeOf(Product product);
}
