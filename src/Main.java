
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      SISTEMA DE EXAMES");
        System.out.println("================================");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println();
        System.out.println("Olá, " + nome + "!");
        System.out.println("Bem-vindo ao Sistema de Exames.");

        scanner.close();
    }
}
