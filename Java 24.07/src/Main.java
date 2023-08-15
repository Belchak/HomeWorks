import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random Random = new Random();
        int randomNumberFirst =Random.nextInt();
        int randomNumberSecond = Random.nextInt();

        Calculator Calculator = new Calculator();

         Calculator.Add(randomNumberFirst,randomNumberSecond);
         Calculator.Subtract(randomNumberFirst,randomNumberSecond);
         Calculator.Multiply(randomNumberFirst,randomNumberSecond);
         Calculator.Divide(randomNumberFirst,randomNumberSecond);





    }
}