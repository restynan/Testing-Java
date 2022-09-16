package com.in28minutes.unitTesting.controller;

import com.in28minutes.unitTesting.model.Item;
import com.in28minutes.unitTesting.service.ItemService;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ItemController.class)
public class ItemControllerTestTalikngToItemService {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ItemService itemService;


    @Test
    public void ItemControllerTest() throws Exception {
        String  expected = IOUtils.resourceToString("/item1.json", StandardCharsets.UTF_8);
        when(itemService.retrieveItems()).thenReturn(new Item(1,"car",2,500));


        RequestBuilder request = MockMvcRequestBuilders
                                  .get("/items")
                                   .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().is(200))
                .andExpect(content().json(expected))
        .andReturn() ;

        System.out.println(result.getResponse().getContentAsString());


    }

    @Test
    public void ItemControllerAllItemsTest() throws Exception {
        String  expected = IOUtils.resourceToString("/items.json", StandardCharsets.UTF_8);
        when(itemService.retrieveAllItems()).thenReturn( Arrays.asList(
                new Item(1001,"pen",7,300),
                new Item(1002,"book",12,1600),
                new Item(1003,"dress",30,800),
                new Item(1004,"shoe",5,346)));


        RequestBuilder request = MockMvcRequestBuilders
                .get("/allItems")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().is(200))
                .andExpect(content().json(expected))
                .andReturn() ;

        System.out.println(result.getResponse().getContentAsString());


    }

}
