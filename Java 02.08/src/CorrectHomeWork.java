import java.util.Random;
import java.util.Scanner;

public class CorrectHomeWork {
    Random random = new Random();
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    public void mathQuizStart(){
        int points = 0;
       for (int v = 0; v <6; v++){
           int firstNum = random.nextInt(0,10);
           int secondNum = random.nextInt(0,10);
           int correctAnswer=calculator.add(firstNum,secondNum);
           System.out.println(firstNum +" + "+ secondNum );
           int userAnswer = scanner.nextInt();
           if (userAnswer==correctAnswer){points = points+5;
           }
           else {points = points-5;}

       }
System.out.println("Вы набрали " + points + " очков");
    }
}
