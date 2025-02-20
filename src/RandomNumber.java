import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;


        number1 = random.nextInt(0, 10);
        number2 = random.nextInt(0, 10);
        number3 = random.nextInt(0, 10);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


    }
}
