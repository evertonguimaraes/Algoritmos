package br.unifor.exemplos.selecao.composta;

import java.util.Scanner;

/**
 * Exemplo 03: Algoritmo que recebe um número como entrada e mostra se este número é par ou ímpar
 */
public class Par {

    public static void main(String[] args) {

        int numero;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe numero: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero impar!");
        }

    }
}
