package src.main.java.AddNumbers;

public class AddNumbers {
    public static float addNumbers(float[] numbers){
        float sum = 0;
        for(float number : numbers){
            sum += number;
        }

        return sum;
    }
}
