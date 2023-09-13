package RPS;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public  static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int b=1; b>0; b++) {
            int computerAnsweer = 0;

                computerAnsweer = random.nextInt(4, 7);     //6-rock 5-scissors 4-paper
            System.out.println("Игра в камень ножницы бумагу\n Введите ч исло от 1 до 3, где: \n " +
                    "1 - Камень\n" +   // 1>5|6 1<4|5   1=6/7
                    "2 - Ножницы\n" +  // 2>4|6 2<6|8   2=5/7
                    "3 - Бумага");     // 3>6|9 3<5|8   3=4/7
            int userAnswer = scanner.nextInt();
            if (computerAnsweer == 4) {
                System.out.println("Противник выбрал бумагу");
            }
            if (computerAnsweer == 5) {
                System.out.println("Противник выбрал ножницы");
            }
            if (computerAnsweer == 6) {
                System.out.println("Противник выбрал камень");
            }
            if (userAnswer + computerAnsweer == 7) {
                System.out.println("Ничья!");

            }
            else if ((userAnswer + computerAnsweer) == 6 || (userAnswer + computerAnsweer) == 9) {
                System.out.println("Вы выиграли!");

            } else {
                System.out.println("Вы проиграли");

            }

        }

    }}
