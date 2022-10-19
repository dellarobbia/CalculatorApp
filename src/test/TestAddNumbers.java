package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.main.java.AddNumbers.AddNumbers;

public class TestAddNumbers {
    float qtyTwo = 2;
    float qtyThree = 3;

    float[] testNumbers = {qtyTwo, qtyThree};

    @Test
    public void test_returnSumEqualsFive(){
        assertEquals(5, AddNumbers.addNumbers(testNumbers));
    }
}
