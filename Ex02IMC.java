package estruturas_controle;

import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Ex02IMC {

    public class CalculoIMC {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite sua altura (em metros): ");
            double altura = sc.nextDouble();

            System.out.print("Digite seu peso (em kg): ");
            double peso = sc.nextDouble();

            double imc = peso / (altura * altura);
            String mensagem;

            if (imc <= 18.5) {
                mensagem = "Abaixo do peso";
            } else if (imc <= 24.9) {
                mensagem = "Peso ideal";
            } else if (imc <= 29.9) {
                mensagem = "Levemente acima do peso";
            } else if (imc <= 34.9) {
                mensagem = "Obesidade grau 1";
            } else if (imc <= 39.9) {
                mensagem = "Obesidade grau 2 (severa)";
            } else {
                mensagem = "Obesidade grau 3 (mórbida)";
            }

            System.out.printf("Seu IMC é: %.2f\n", imc);
            System.out.println("Classificação: " + mensagem);

            sc.close();
        }
    }
        }


















