package com.neusoft.elmboot.util;

import com.neusoft.elmboot.bo.BusinessBo;
import com.neusoft.elmboot.entity.BusinessEntity;
import org.junit.Test;


public class ModelConverterUtilsTest {

    @Test
    public void testConvert() {
        BusinessEntity bE = new BusinessEntity(1, "test", "address", "explain", "Img", 1, 0.0, 0.0, "remark");
        BusinessBo bB = ModelConverterUtils.convert(bE, BusinessBo.class);
        System.out.println(bB);
    }
}
