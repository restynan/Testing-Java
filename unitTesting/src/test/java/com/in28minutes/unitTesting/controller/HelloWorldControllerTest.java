package com.in28minutes.unitTesting.controller;

import com.in28minutes.unitTesting.controller.HelloWorldController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {
   @Autowired
    private MockMvc mockMvc;


    @Test
    public void helloWorld_basic() throws Exception {
       RequestBuilder request = MockMvcRequestBuilders
                                .get("/hello-world")
                                 .accept(MediaType.APPLICATION_JSON);

      MvcResult result= mockMvc.perform(request)
                        .andExpect(status().is(200))
                        .andExpect(content().string("Hello world"))
                        .andReturn();
      // assertEquals("Hello world", result.getResponse().getContentAsString());
    }

}
