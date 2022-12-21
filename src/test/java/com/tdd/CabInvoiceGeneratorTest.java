package com.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
    public void givenDistanceTime_ShouldReturnTotalFare() {

        double distance =4.0;
        int time=10;
        double fare = cabInvoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(40,fare);
    }

}
