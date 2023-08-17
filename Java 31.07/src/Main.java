import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner =new Scanner(System.in);

      int userAnswer = 0;
      int sumVar = 0;
      do {int randomNum1 = random.nextInt(1000);
          int randomNum2 = random.nextInt(1000);
          sumVar= randomNum1+randomNum2;

          System.out.println("Введите суммму этих чисел "+ randomNum2 + "; "+randomNum1);
          userAnswer = scanner.nextInt();
          System.out.println("Ваш ответ: "+userAnswer + " Верный ответ: " + sumVar );

      } while(sumVar != userAnswer);
      System.out.println("Вы отличный математик!");
        }

    }
