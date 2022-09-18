package com.neusoft.elmboot.util;

import org.junit.Assert;
import org.junit.Test;

public class CommonUtilTest {
    @Test
    public void testCurrentDate() {
        String currentDate = CommonUtil.getCurrentDate();
        Assert.assertNotNull(currentDate);
        System.out.println(currentDate);
    }

}
