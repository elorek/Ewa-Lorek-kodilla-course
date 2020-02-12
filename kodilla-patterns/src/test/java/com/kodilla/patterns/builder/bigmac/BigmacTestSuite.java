package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given & When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("mushrooms")
                .ingredient("onion")
                .ingredient("cucumber")
                .build();
        //Then
        Assert.assertEquals("roll", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("barbecue", bigmac.getSauce());
        Assert.assertEquals(3, bigmac.getIngredients().size());
    }
}
