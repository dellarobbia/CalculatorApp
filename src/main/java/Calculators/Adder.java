package src.main.java.Calculators;

public class Adder extends Calculator{

    public Adder(float[] numbers){
        super(numbers);
    }

    @Override
    public void calculate(){
        addNumbers();
    }

    private void addNumbers(){
        for(float number : numbers){
            result += number;
        }
    }
}
