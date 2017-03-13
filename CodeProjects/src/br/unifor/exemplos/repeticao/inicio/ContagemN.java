package br.unifor.exemplos.repeticao.inicio;

import java.util.Scanner;

/**
 * Exemplo 02: Algoritmo que recebe como entrada um inteiro n e imprime todos os inteiros de 1 a n.
 */
public class ContagemN {

    public static void main(String[] args) {

        int n, cont;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro qualquer. ");
        n = scanner.nextInt();

        cont = 1;

        while (cont <= n) {
            System.out.printf("%d \n", cont);
            cont = cont + 1;
        }
    }
}
