import java.util.Scanner;

public class TextMessage{
    public String message ="";  //text of message
 TextMessage(){}       //basic constructor

public TextMessage(String text){                           //constructor with 1 arS
     message = text;
     message=text.replace("bullshit", "bu**t").replace("fuck", "f**k");
}
}
