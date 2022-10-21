package src.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.main.java.Calculators.Adder;

public class TestAddNumbers {
    float qtyTwo = 2;
    float qtyThree = 3;

    float[] testNumbers = {qtyTwo, qtyThree};

    Adder testAdder = new Adder(testNumbers);
    
    @Test
    public void test_AddNumbersEqualsFive(){
        testAdder.calculate();
        assertEquals(5, testAdder.getSum());
    }
}
