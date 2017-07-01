package com.karumi.maxibonkata;


import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class DeveloperProperties {

    public static final String MAXIBONS_NUMBER = "Maxibons Numbers: %s , Developer's Maxibons: %s";
    public static final String NAME_IS_EQUALS_TO_ANOTHER_NAME = "%s is equals to %s";

    @Property
    public void aDeveloperHaveANumberOfMaxibonsGreaterOrEqualsThanZero(
            final int numberOfMaxibons) {

        final String developerName = "Paco";
        final Developer developer = new Developer(developerName, numberOfMaxibons);

        System.out.println(String.format(MAXIBONS_NUMBER,
                numberOfMaxibons, developer.getNumberOfMaxibonsToGrab()));

        Assert.assertTrue(developer.getNumberOfMaxibonsToGrab() >= 0);
    }

    @Property
    public void whenADeveloperIsCreatedTheNameIsEqualThanParameterGiven(final String developerName) {

        final int numberOfMaxibons = 0;
        final Developer developer = new Developer(developerName, numberOfMaxibons);

        System.out.println(String.format(NAME_IS_EQUALS_TO_ANOTHER_NAME,
                developer.getName(), developerName));

        Assert.assertEquals(developer.getName(), developerName);
    }
}
