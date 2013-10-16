package com.amanking.smelly.architecture.service;

import com.amanking.smelly.architecture.dao.InventoryDao;
import com.amanking.smelly.architecture.domain.Inventory;
import com.amanking.smelly.architecture.domain.InventoryType;
import com.amanking.smelly.architecture.extra.Autowired;
import com.amanking.smelly.architecture.extra.Service;

@Service
public class InventoryService {
    @Autowired private InventoryDao inventoryDao;

    public Inventory findInventory(String productId) {
        return inventoryDao.findInventory(productId);
    }
}
