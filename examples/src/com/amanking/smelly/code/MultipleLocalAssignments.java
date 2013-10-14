package com.amanking.smelly.code;

public class MultipleLocalAssignments {

    public String buildProductString(String product) {
        String type = type(product);
        String brand = brand(product);

        return type + " : " + brand + " : " + product;
    }

    private String brand(String product) {
        if (product.contains("lumia")) {
            return "nokia";
        }
        if (product.contains("iphone") || product.contains("ipad")) {
            return "apple";
        }
        if (product.contains("galaxy")) {
            return "samsung";
        }
        return "";
    }

    private String type(String product) {
        if (product.contains("lumia") || product.contains("iphone") || (product.contains("galaxy") && !product.contains("tab"))) {
            return "mobile";
        }
        if (product.contains("ipad") || (product.contains("galaxy") && product.contains("tab"))) {
            return "tablet";
        }
        return "";
    }

}
