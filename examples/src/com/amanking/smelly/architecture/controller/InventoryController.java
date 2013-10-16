package com.amanking.smelly.architecture.controller;

import com.amanking.smelly.architecture.domain.Inventory;
import com.amanking.smelly.architecture.domain.Product;
import com.amanking.smelly.architecture.extra.*;
import com.amanking.smelly.architecture.service.InventoryService;
import com.amanking.smelly.architecture.service.ProductService;

@Controller
public class InventoryController {
    private ProductService productService;
    private InventoryService inventoryService;

    @Autowired
    public InventoryController(ProductService productService, InventoryService inventoryService) {
        this.productService = productService;
        this.inventoryService = inventoryService;
    }

    @RequestMapping(value="/products/{productId}", method= RequestMethod.GET)
    public String findProduct(@PathVariable String productId, Model model) {
        Product product = productService.findProduct(productId);
        model.addAttribute("product", product);

        Inventory inventory = inventoryService.findInventory(productId);
        if (inventory.isAvailable()) {
            model.addAttribute("inventoryCount", inventory.getInventoryCount());
        }
        return "displayProduct";
    }
}
