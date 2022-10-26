package com.dellarobbia.Calculators;

public class Calculator implements Calculators{
    protected float[] numbers;
    protected float result;

    public float[] getNumbers(){
        return numbers;
    }
    public void setNumbers(float[] numbers){
        this.numbers = numbers;
    }

    public float getResult(){
        return result;
    }
    public void setResult(float result){
        this.result = result;
    }

    public Calculator(float[] numbers){
        setNumbers(numbers);
        setResult(0);
    }

    @Override
    public void calculate(){
        System.out.println("No calculator type selected.");
    }
}
