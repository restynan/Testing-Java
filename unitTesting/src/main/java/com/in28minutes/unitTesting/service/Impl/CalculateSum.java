package com.in28minutes.unitTesting.service.Impl;

import com.in28minutes.unitTesting.service.CalculateSumService;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class CalculateSum {
    private CalculateSumService calculateSumservice;
  /*  public void setCalculateSumservice(CalculateSumService calculateSumservice) {
        this.calculateSumservice = calculateSumservice;
    }
*/
    public int calculate(){

        int data []= calculateSumservice.retrieveData();
      OptionalInt total = Arrays.stream(data).reduce(Integer::sum);
        return total.orElse(0);
    }
}
