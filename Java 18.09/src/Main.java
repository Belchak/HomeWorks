import javax.management.StringValueExp;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
       Random random = new Random();
        int computerMoney =0;
        int i = 0;

while (computerMoney<=10000){
        int money = random.nextInt(3);

i++;
        int giftMOney=0;
if (money == 0) {
    giftMOney = 50;
}
if (money ==1){
    giftMOney = 100;
}
if (money ==2){
    giftMOney=200;
}
if (money ==3){
    giftMOney=500;
}
computerMoney= computerMoney+giftMOney;
    }
        System.out.println(i+ " друзей  подарили вам сумму, достаточную для покупки компьютера\nпора веселиться!");}}