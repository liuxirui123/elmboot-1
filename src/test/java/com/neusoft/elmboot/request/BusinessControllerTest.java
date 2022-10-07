package com.neusoft.elmboot.request;


import com.neusoft.elmboot.controller.BusinessController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static com.neusoft.elmboot.TestCases.businessOrderTypeIds;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BusinessControllerTest {
    @Autowired
    BusinessController businessController;
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testListBusinessByOrderTypeId() throws Exception {
        RequestBuilder requestBuilder;

        for (int id : businessOrderTypeIds) {
            requestBuilder = post("/BusinessController/listBusinessByOrderTypeId").param("orderTypeId", String.valueOf(id));

            //执行请求
            mockMvc.perform(requestBuilder)
                    .andExpect(status().isOk())//返回HTTP状态为200
                    .andDo(print());//打印结果
            //.andReturn();//想要返回结果，使用此方法
        }

    }
}
