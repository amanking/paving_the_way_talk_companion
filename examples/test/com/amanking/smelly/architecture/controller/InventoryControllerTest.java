package com.amanking.smelly.architecture.controller;

import com.amanking.smelly.architecture.domain.Product;
import com.amanking.smelly.architecture.extra.Model;
import com.amanking.smelly.architecture.service.ProductService;
import junit.framework.Assert;
import org.junit.Test;

import static com.amanking.smelly.architecture.extra.Mockito.mock;
import static com.amanking.smelly.architecture.extra.Mockito.when;

public class InventoryControllerTest {

    @Test
    public void shouldFetchProductBasedOnProductId() {
        Product product = new Product();

        ProductService mockProductService = mock(ProductService.class);
        when(mockProductService.findProduct("123456")).thenReturn(product);

        InventoryController controller = new InventoryController();

        Model model = new Model();
        controller.findProduct("123456", model);

        Assert.assertEquals(product, model.getAttribute("product"));
    }

}
