package com.neusoft.elmboot;

import org.junit.Assert;

import java.util.List;

public class TestUtil {
    public static void testList(List<Object> list, boolean ifNull) {
        if (ifNull) {
            Assert.assertEquals(0, list.size());
            System.out.println("Null List");
        } else {
            Assert.assertTrue(list.size() > 0);
            System.out.println(list.size());
            for (Object o : list) {
                testSingle(o, false);
            }
            System.out.println("");
        }

    }


    public static void testSingle(Object o, boolean ifNull) {
        if (ifNull) {
            Assert.assertNull(o);
            System.out.println("Null Object");
        } else {
            Assert.assertNotNull(o);
            System.out.println(o);
        }
    }

}
