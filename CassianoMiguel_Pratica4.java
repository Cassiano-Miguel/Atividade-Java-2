//Cassiano Miguel Almeida Santana
import java.util.Scanner;

public class CassianoMiguel_Pratica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura*altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepesa");
        } else {
            System.out.println("Obesidade");
        }

        scanner.close();
    }
}
