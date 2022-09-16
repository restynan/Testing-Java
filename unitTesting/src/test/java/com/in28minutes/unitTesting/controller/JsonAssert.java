package com.in28minutes.unitTesting.controller;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JsonAssert {
    String actual =IOUtils.resourceToString("/item1.json", StandardCharsets.UTF_8);

    public JsonAssert() throws IOException {
    }

    @Test
    public void jsonAssertTest_Strict_true() throws IOException, JSONException {
        String expected = IOUtils.resourceToString("/item1.json",StandardCharsets.UTF_8);
        JSONAssert.assertEquals(expected,actual,true);

    }
    @Test
    public void jsonAssertTest_Strict_false() throws IOException, JSONException {
        String expected = IOUtils.resourceToString("/item2.json",StandardCharsets.UTF_8);
        JSONAssert.assertEquals(expected,actual,false);

    }
}
