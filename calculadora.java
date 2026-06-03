
import java.util.Scanner;


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Primeiro número: ");
                    double n1 = ler.nextDouble();

                    System.out.print("Segundo número: ");
                    double n2 = ler.nextDouble();

                    System.out.println("Resultado = " + (n1 + n2));
                    break;

                case 2:
                    System.out.print("Primeiro número: ");
                    n1 = ler.nextDouble();

                    System.out.print("Segundo número: ");
                    n2 = ler.nextDouble();

                    System.out.println("Resultado = " + (n1 - n2));
                    break;

                case 3:
                    System.out.print("Primeiro número: ");
                    n1 = ler.nextDouble();

                    System.out.print("Segundo número: ");
                    n2 = ler.nextDouble();

                    System.out.println("Resultado = " + (n1 * n2));
                    break;

                case 4:
                    System.out.print("Primeiro número: ");
                    n1 = ler.nextDouble();

                    System.out.print("Segundo número: ");
                    n2 = ler.nextDouble();

                    if (n2 != 0) {
                        System.out.println("Resultado = " + (n1 / n2));
                    } else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                    break;

                case 5:
                    System.out.print("Base: ");
                    double base = ler.nextDouble();

                    System.out.print("Expoente: ");
                    int exp = ler.nextInt();

                    System.out.println("Resultado = " + Math.pow(base, exp));
                    break;

                case 0:
                    System.out.println("Saindo da calculadora...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        ler.close();
    }
