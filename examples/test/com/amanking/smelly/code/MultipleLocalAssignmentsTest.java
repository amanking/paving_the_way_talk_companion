package com.amanking.smelly.code;

import org.junit.Assert;
import org.junit.Test;

public class MultipleLocalAssignmentsTest {

    @Test
    public void shouldReturnProductStringForNokiaLumia() {
        MultipleLocalAssignments code = new MultipleLocalAssignments();
        Assert.assertEquals("mobile : nokia : lumia 720", code.buildProductString("lumia 720"));
    }

    @Test
    public void shouldReturnProductStringForAppleIphone() {
        MultipleLocalAssignments code = new MultipleLocalAssignments();
        Assert.assertEquals("mobile : apple : iphone 5", code.buildProductString("iphone 5"));
    }

    @Test
    public void shouldReturnProductStringForSamsungGalaxyTab() {
        MultipleLocalAssignments code = new MultipleLocalAssignments();
        Assert.assertEquals("tablet : samsung : galaxy tab 750", code.buildProductString("galaxy tab 750"));
    }

    @Test
    public void shouldReturnProductStringForSamsungGalaxyS() {
        MultipleLocalAssignments code = new MultipleLocalAssignments();
        Assert.assertEquals("mobile : samsung : galaxy s3", code.buildProductString("galaxy s3"));
    }

    @Test
    public void shouldReturnProductStringForAppleIpad() {
        MultipleLocalAssignments code = new MultipleLocalAssignments();
        Assert.assertEquals("tablet : apple : ipad 4", code.buildProductString("ipad 4"));
    }

    @Test
    public void shouldReturnProductStringForUnknownProduct() {
        MultipleLocalAssignments code = new MultipleLocalAssignments();
        Assert.assertEquals(" :  : canvas 4", code.buildProductString("canvas 4"));
    }

}
