import java.util.Scanner;

public class CalculateRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculadora de Área de um Retangulo.\n");

        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o comprimento do retangulo: ");
        double comprimento = scanner.nextDouble();

        System.out.println("A área do retangulo é: " + altura * comprimento + " cm²");

        scanner.close();
    }
}
