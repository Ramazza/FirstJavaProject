import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double result;

        System.out.print("Qual o valor de A? ");
        a = scanner.nextDouble();

        System.out.print("Qual o valor de B? ");
        b = scanner.nextDouble();

        result = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("A hipotenusa de A e B é de " + Math.round(result));

        scanner.close();
    }
}
