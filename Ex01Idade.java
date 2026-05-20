package fundamentos;

import java.util.Scanner;

public class Ex01Idade {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int anoAtual = 2026;
        System.out.print("Digite seu nome : ");
        String nome = scanner.nextLine();

        System.out.print("Digite  o ano de nascimento:");
          int anoNascimento = scanner.nextInt();


           int idade = 2026-anoNascimento;

        System.out.println ("Olá, " + nome + " ! voce tem " + idade + " anos de idade!" );




    }
}


