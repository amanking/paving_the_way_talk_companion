package com.amanking.smelly.code;

public class MultipleLocalAssignments {

    public String buildProductString(String product) {
        String type = "";
        String brand = "";

        if (product.contains("lumia")) {
            type = "mobile";
            brand = "nokia";
        } else if (product.contains("iphone")) {
            type = "mobile";
            brand = "apple";
        } else if (product.contains("galaxy")) {
            brand = "samsung";
        } else if (product.contains("ipad")) {
            type = "tablet";
            brand = "apple";
        }
        if (brand.equals("samsung")) {
            if (product.contains("tab")) {
                type = "tablet";
            } else {
                type = "mobile";
            }
        }

        return type + " : " + brand + " : " + product;
    }

}
