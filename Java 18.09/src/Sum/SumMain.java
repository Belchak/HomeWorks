package Sum;

import java.util.Scanner;

public class SumMain {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do {
    System.out.println("Введите диапозон от; ");
    int firstNum = scanner.nextInt() - 1;
    System.out.println("до");
    int secondNum = scanner.nextInt();scanner.nextLine();
    int sum = 0;



        do {
            for (; firstNum % 2 == 1; ) {
                sum = sum + firstNum;
                break;

            }
            firstNum++;

             } while(firstNum <= secondNum);
        System.out.println("Получилось число " + sum);


        System.out.println("Для выхода напишите Quit, для продолжения введите любые символы");
    }

    while(!"quit".equalsIgnoreCase(scanner.nextLine()));

    }



    }









