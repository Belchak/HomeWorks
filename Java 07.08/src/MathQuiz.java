import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    Random random = new Random();
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

    public void mathQuizStart() {
        int[] points = new int[3];
        System.out.print("Игрок 1, введитте своё имя: ");
        String name1 = scanner.nextLine();
        System.out.print("Игрок 2, введитте своё имя: ");
        String name2 = scanner.nextLine();
        System.out.print("Игрок 3, введитте своё имя: ");
        String name3 = scanner.nextLine();


        for (int v = 0; v < 6; v++) {

            int firstNum = random.nextInt(0, 10);
            int secondNum = random.nextInt(0, 10);
            int correctAnswer = calculator.add(firstNum, secondNum);
            System.out.println("Игрок " + name1 + " вопрос №" + (v + 1) + ": " + firstNum + " + " + secondNum);
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                points[0] = points[0] + 5;
            } else {
                points[0] = points[0] - 5;
            }

        }
        System.out.println("Игрок " + name1 + " набрал " + points[0] + " очков");

        for (int v = 0; v < 6; v++) {

            int firstNum = random.nextInt( 10)+1;
            int secondNum = random.nextInt( 10) +1;
            int correctAnswer = calculator.subtract(firstNum, secondNum);
            System.out.println("Игрок " + name2 + " вопрос №" + (v + 1) + ": " + firstNum + " - " + secondNum);
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                points[1] = points[1] + 5;
            } else {
                points[1] = points[1] - 5;
            }


        }
        System.out.println("Игрок " + name2 + " набрал " + points[1] + " очков");

        for (int v = 0; v < 6; v++) {

            int firstNum = random.nextInt( 10)+1;
            int secondNum = random.nextInt( 10) +1;
            int correctAnswer = calculator.multiply(firstNum, secondNum);
            System.out.println("Игрок " + name3 + " вопрос №" + (v + 1) + ": " + firstNum + " * " + secondNum);
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                points[2] = points[2] + 5;
            } else {
                points[2] = points[2] - 5;
            }


        }
        System.out.println("Игрок " + name3 + " набрал " + points[2] + " очков");
        if (points[0]>points[1] && points[0]>points[2]){
            System.out.println("Выиграл игрок "+ name1 +" !");
        }
        if (points[1]>points[0] && points[1]>points[2]) {
            System.out.println("Выиграл игрок " + name2 + " !");
        }
        if (points[2]>points[1] && points[2]>points[0]){
            System.out.println("Выиграл игрок "+ name3 +" !");
    }

}}