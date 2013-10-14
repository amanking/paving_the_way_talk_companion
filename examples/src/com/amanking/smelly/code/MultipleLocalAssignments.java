package com.amanking.smelly.code;

public class MultipleLocalAssignments {

    public String buildProductString(String productName) {
        Product product = new Product(productName);
        return product.toProductString();
    }

}
