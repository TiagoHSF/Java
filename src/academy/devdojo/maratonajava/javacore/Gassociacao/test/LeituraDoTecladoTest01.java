package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("O nome digitado foi " + nome +
                ", o mesmo possui " + idade + " anos e do sexo: "
                + sexo);
    }
}