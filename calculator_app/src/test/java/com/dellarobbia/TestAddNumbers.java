package com.dellarobbia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dellarobbia.Calculators.Adder;

public class TestAddNumbers {
    float qtyTwo = 2;
    float qtyThree = 3;

    float[] testNumbers = {qtyTwo, qtyThree};

    Adder testAdder = new Adder(testNumbers);
    
    @Test
    public void test_AddNumbersEqualsFive(){
        testAdder.calculate();
        assertEquals(5, testAdder.getResult());
    }
}
