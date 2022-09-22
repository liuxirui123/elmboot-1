package com.neusoft.elmboot.controller;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    BusinessController businessController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testListBusinessByOrderTypeId() throws Exception {
        int[] orderTypeIds = {1, 4, 10000};

        RequestBuilder requestBuilder = null;

        requestBuilder = post("/BusinessController/listBusinessByOrderTypeId").param("orderTypeId", "1");

        //执行请求
        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())//返回HTTP状态为200
                .andDo(print());//打印结果
        //.andReturn();//想要返回结果，使用此方法

    }
}
