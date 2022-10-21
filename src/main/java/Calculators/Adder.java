package src.main.java.Calculators;

public class Adder implements Calculators{
    private float[] numbers;
    private float sum;

    public float[] getNumbers(){
        return numbers;
    }
    public void setNumbers(float[] numbers){
        this.numbers = numbers;
    }

    public float getSum(){
        return sum;
    }

    public Adder(float[] numbers){
        setNumbers(numbers);
        sum = 0;
    }

    @Override
    public void calculate(){
        addNumbers();
    }

    private void addNumbers(){
        for(float number : numbers){
            sum += number;
        }
    }
}
