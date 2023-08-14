import java.lang.annotation.Target;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TextMessage fuck = new TextMessage("Hi fucking gays");
        System.out.println(fuck.message);
        TextMessage bull= new TextMessage("You looks like bullshit");
        System.out.println(bull.message);
        TextMessage love = new TextMessage("Love you so much");
        System.out.println(love.message);

        String inputText = scanner.nextLine();
        TextMessage TextMessage = new TextMessage(inputText);
        System.out.println(TextMessage.message);     //This car fucking bullshit
    }
}

