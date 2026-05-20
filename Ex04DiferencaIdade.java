package fundamentos;

import java.util.Scanner;

public class Ex04DiferencaIdade {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2, diferenca;
        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = scanner.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = scanner.nextInt();
        diferenca = Math.abs(idade1 - idade2);
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é: " + diferenca + " anos.");
        scanner.close();
    }
}











