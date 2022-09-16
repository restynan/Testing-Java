package com.in28minutes.unitTesting.IntergratioTest;

import com.in28minutes.unitTesting.controller.JsonAssert;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemIntergrationTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void itemItTest() throws IOException, JSONException {
        String  expected = IOUtils.resourceToString("/items.json", StandardCharsets.UTF_8);
        String response = testRestTemplate.getForObject("/allItems",String.class);
   JSONAssert.assertEquals(expected,response,false);
    }

}

