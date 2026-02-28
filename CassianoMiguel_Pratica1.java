//Cassiano Miguel Almeida Santana

import java.util.Scanner;

public class CassianoMiguel_Pratica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira número de 5 dígitos: ");
        String numero = scanner.nextLine();

        if (numero.length() == 5 && numero.matches("\\d+")) {

            String resultado = String.join("   ", numero.split(""));
            System.out.println(resultado);
            
        } else {
            System.out.println("Numero invalido.");
        }
        scanner.close();
    }
}
