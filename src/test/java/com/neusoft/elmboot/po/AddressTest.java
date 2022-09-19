package com.neusoft.elmboot.po;

import org.junit.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testGetDistance() {
        Address TJULibrary = new Address(117.320578, 39.003357);//郑东图书馆
        Address TJUBuilding55 = new Address(117.32064, 39.005848);//55教
        Address TJUGym = new Address(117.326274, 39.007984);

        Assert.assertSame(Address.getDistance(TJULibrary, TJULibrary), 0);
        System.out.println(Address.getDistance(TJUBuilding55, TJULibrary));
        System.out.println(Address.getDistance(TJUGym, TJULibrary));
        System.out.println(Address.getDistance(TJUBuilding55, TJUGym));
    }
}
