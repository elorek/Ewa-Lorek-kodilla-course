package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        Country india = new Country("India", new BigDecimal("1296384042"));
        Country china = new Country("China", new BigDecimal("1420000000"));
        Country japan = new Country("Japan", new BigDecimal("125590107"));
        Country thailand = new Country("Thailand", new BigDecimal("69091089"));
        Country turkey = new Country("Turkey", new BigDecimal("82835090"));

        Country poland = new Country("Poland", new BigDecimal("32202200"));
        Country germany = new Country("Germany", new BigDecimal("82212200"));
        Country france = new Country("France", new BigDecimal("62222200"));
        Country portugal = new Country("Portugal", new BigDecimal("12232216"));
        Country sweden = new Country("Sweden", new BigDecimal("12202284"));

        Country morocco = new Country("Morocco", new BigDecimal("32282255"));
        Country nigeria = new Country("Nigeria", new BigDecimal("202252205"));
        Country senegal = new Country("Senegal", new BigDecimal("12262222"));
        Country tanzania = new Country("France", new BigDecimal("52252235"));
        Country algeria = new Country("Algeria", new BigDecimal("42232200"));

        // When
        Continent asia = new Continent("Asia");
        asia.addCountry(india);
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(thailand);
        asia.addCountry(turkey);

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(portugal);
        europe.addCountry(sweden);

        Continent africa = new Continent("Africa");
        africa.addCountry(morocco);
        africa.addCountry(nigeria);
        africa.addCountry(senegal);
        africa.addCountry(tanzania);
        africa.addCountry(algeria);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        BigDecimal howManyPeople = world.getPeopleQuantity();
        // Then
        Assert.assertEquals(new BigDecimal("3536252545"), howManyPeople);
    }
}
