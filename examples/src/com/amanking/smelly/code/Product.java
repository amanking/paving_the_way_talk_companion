package com.amanking.smelly.code;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String toProductString() {
        return type() + " : " + brand() + " : " + name;
    }

    public boolean matches(String nameToMatch) {
        return name.contains(nameToMatch);
    }

    private String type() {
        return matchingBrand().typeOf(this);
    }

    private String brand() {
        return matchingBrand().lowerCaseName();
    }

    private Brand matchingBrand() {
        for (Brand brand : Brand.values()) {
            if (brand.isManufacturerOf(this)) {
                return brand;
            }
        }
        return Brand.UNKNOWN;
    }
}
