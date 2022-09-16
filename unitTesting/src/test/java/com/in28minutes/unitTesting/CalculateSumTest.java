package com.in28minutes.unitTesting;

import com.in28minutes.unitTesting.service.Impl.CalculateSum;
import com.in28minutes.unitTesting.service.CalculateSumService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class CalculateSumTest {

    @Mock
    private CalculateSumService calculateSumService;

    @InjectMocks
    private CalculateSum calculateSum;


    @Test
    public void calculateSumvalidTest(){

        when(calculateSumService.retrieveData()).thenReturn(new int []{4,6});
        assertEquals(10,calculateSum.calculate());
    }

}
