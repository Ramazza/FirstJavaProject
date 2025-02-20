import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){

        String compra;
        double valor;
        int quantia;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual item você deseja comprar? ");
        compra = scanner.nextLine();

        System.out.print("Qual o valor de cada um? ");
        valor = scanner.nextDouble();

        System.out.print("Quantos você vai levar? ");
        quantia = scanner.nextInt();

        System.out.println("Você comprou " + quantia + " " + compra);
        System.out.println("A compra ficou no valor de R$" + quantia * valor);

        scanner.close();
    }
}
