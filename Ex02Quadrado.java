package fundamentos;

import java.util.Scanner;

public class Ex02Quadrado

{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A area do quadrado e: " + area);

        scanner.close();
    }
}
