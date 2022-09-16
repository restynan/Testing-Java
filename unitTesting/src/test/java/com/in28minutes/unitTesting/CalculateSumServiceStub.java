package com.in28minutes.unitTesting;

import com.in28minutes.unitTesting.service.CalculateSumService;

public class CalculateSumServiceStub implements CalculateSumService {
    @Override
    public int[] retrieveData() {
        return new int[]{2,3,5};
    }
}
