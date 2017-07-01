package com.karumi.maxibonkata;


import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class DeveloperProperties {

    public static final String MAXIBONS_NUMBER = "Maxibons Numbers: %s , Developer's Maxibons: %s";

    @Property
    public void aDeveloperHaveANumberOfMaxibonsGreaterOrEqualsThanZero(
            final int numberOfMaxibons) {

        final String developerName = "Paco";
        final Developer developer = new Developer (developerName, numberOfMaxibons);

        System.out.println(String.format(MAXIBONS_NUMBER,
                numberOfMaxibons, developer.getNumberOfMaxibonsToGrab()));

        Assert.assertTrue(developer.getNumberOfMaxibonsToGrab() >= 0);
    }
}
