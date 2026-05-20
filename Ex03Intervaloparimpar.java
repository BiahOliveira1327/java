package fundamentos;

import java.util.Scanner;
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiro, segundo;
        String opcao;

        System.out.print("Digite o primeiro número: ");
        primeiro = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        segundo = sc.nextInt();

        if (segundo <= primeiro) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
            return;
        }

        System.out.print("Escolha (par ou impar): ");
        opcao = sc.next();

        System.out.println("Resultado:");

        if (opcao.equalsIgnoreCase("par")) {
            for (int i = segundo; i >= primeiro; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (opcao.equalsIgnoreCase("impar")) {
            for (int i = segundo; i >= primeiro; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
