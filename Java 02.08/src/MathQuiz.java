import java.util.Random;
import java.util.Scanner;

public class MathQuiz {


Random random = new Random();
Scanner scanner = new Scanner(System.in);
Calculator calculator = new Calculator();


          public int quantityOfAnswers = 0;





            public void MathQuizStart(){




                    int quantityOfPoints = 0;
                    int gotPoints = quantityOfPoints;
                    int secondNumber = random.nextInt(0, 10);
                    int firstNumber = random.nextInt(0, 10);
                    System.out.println("Введите сумму чисел " + firstNumber + "+" + secondNumber);
                    int answer1 = scanner.nextInt();
                    int CorrectAddAnswer = calculator.add(firstNumber, secondNumber);

                    //Сложение

                    if (CorrectAddAnswer == answer1) {
                        quantityOfPoints = quantityOfPoints +5;
                    }else{
                    quantityOfPoints = quantityOfPoints -5;}

                    //Сложение

                    secondNumber = random.nextInt(0, 10);
                    firstNumber = random.nextInt(0, 10);
                    CorrectAddAnswer = calculator.add(firstNumber, secondNumber);
                    System.out.println("Введите сумму чисел " + firstNumber + "+" + secondNumber);
                    int answer2 = scanner.nextInt();
                    if (CorrectAddAnswer == answer2) {
                        quantityOfPoints = quantityOfPoints +5;
                    }
                    else {
                    quantityOfPoints = quantityOfPoints -5;}

                    //вычитание
                    secondNumber = random.nextInt(0, 10);
                    firstNumber = random.nextInt(0, 10);
                    CorrectAddAnswer = calculator.subtract(firstNumber, secondNumber);
                    System.out.println("Введите вычитание чисел " + firstNumber + "-" + secondNumber);
                    int answer3 = scanner.nextInt();
                    if (CorrectAddAnswer == answer3) {
                        quantityOfPoints = quantityOfPoints+5;
                    }
                    else {
                    quantityOfPoints = quantityOfPoints -5;}
                    //вычитание

                    secondNumber = random.nextInt(0, 10);
                    firstNumber = random.nextInt(0, 10);
                    CorrectAddAnswer = calculator.subtract(firstNumber, secondNumber);
                    System.out.println("Введите вычитание чисел " + firstNumber + "-" + secondNumber);
                    int answer4 = scanner.nextInt();
                    if (CorrectAddAnswer == answer4) {
                            quantityOfPoints = quantityOfPoints+5;
                    }
                    else {
                    quantityOfPoints = quantityOfPoints -5;}


//                Умножение
                secondNumber = random.nextInt(0, 10);
                firstNumber = random.nextInt(0, 10);
                CorrectAddAnswer = calculator.multiply(firstNumber, secondNumber);
                System.out.println("Введите проризведение чисел " + firstNumber + "*" + secondNumber);
                int answer5 = scanner.nextInt();
                if (CorrectAddAnswer == answer5) {
                    quantityOfPoints = quantityOfPoints+5;
                }
                else{
                    quantityOfPoints = quantityOfPoints -5;}


//                 деление
                secondNumber = random.nextInt(1, 10);
                firstNumber = random.nextInt(1, 10);
                CorrectAddAnswer = calculator.divide(firstNumber, secondNumber);
                System.out.println("Введите деление чисел " + firstNumber + "/" + secondNumber);
                int answer6 = scanner.nextInt();
                if (CorrectAddAnswer == answer6) {
                    quantityOfPoints = quantityOfPoints+5;
                }
                else {
                    quantityOfPoints = quantityOfPoints -5;}


                    System.out.println("Подравляю! Вы набрали " + quantityOfPoints + " Очков");
                }




            }





