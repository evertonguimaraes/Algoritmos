package br.unifor.exemplos.selecao.simples;

import java.util.Scanner;

/**
 * Exemplo 01: Algoritmo que recebe um número como entrada e  mostra se este número é múltiplo de 3.
 */

public class Multiplo3 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe numero: ");

        numero = scanner.nextInt();

        if (numero % 3 == 0) {
            System.out.println("Multiplo de 3.");
        }
    }
}
