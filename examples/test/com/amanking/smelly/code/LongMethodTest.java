package com.amanking.smelly.code;

import org.junit.Assert;
import org.junit.Test;

public class LongMethodTest {
    @Test
    public void shouldReturnTrueForGalaxyTab11() {
        LongMethod code = new LongMethod();
        Assert.assertTrue(code.isPreOrder("Galaxy Tab 11"));
    }

    @Test
    public void shouldReturnFalseForNonGalaxyTab11() {
        LongMethod code = new LongMethod();
        Assert.assertFalse(code.isPreOrder("Micro Tab 11"));
    }

    @Test
    public void shouldReturnFalseForGalaxyTab10() {
        LongMethod code = new LongMethod();
        Assert.assertFalse(code.isPreOrder("Galaxy Tab 10"));
    }

    @Test
    public void shouldReturnTrueForAnyProductIfPreOrderMentioned() {
        LongMethod code = new LongMethod();
        Assert.assertTrue(code.isPreOrder("Micro Tab 10 PRE-ORDER"));
    }

    @Test
    public void shouldReturnTrueForAnyProductIfPreOrderForced() {
        LongMethod code = new LongMethod();
        code.setForcePreOrder(true);
        Assert.assertTrue(code.isPreOrder("Galaxy Tab 10"));
    }
}
