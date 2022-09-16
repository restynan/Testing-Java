package com.in28minutes.unitTesting;

import com.in28minutes.unitTesting.service.Impl.CalculateSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateSumStubTest {
    private CalculateSum calculateSum;

    private CalculateSumServiceStub calculateSumServiceStub;

    @BeforeEach
    public void setUp(){
        calculateSum = new CalculateSum();
        calculateSumServiceStub =new CalculateSumServiceStub();
        //calculateSum.setCalculateSumservice(calculateSumServiceStub);
    }

    @Test
    public void calculateSumvalidTest(){
        int actualSum = calculateSum.calculate();
        //then
        assertEquals(10,actualSum);
    }

}
