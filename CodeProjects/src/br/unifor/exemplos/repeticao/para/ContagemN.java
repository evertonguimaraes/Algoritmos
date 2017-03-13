package br.unifor.exemplos.repeticao.para;

import java.util.Scanner;

/**
 * Exemplo 03: Algoritmo que recebe como entrada um inteiro n e imprime todos os inteiros de 1 a n.
 */
public class ContagemN {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero qualquer: ");
        n = scanner.nextInt();

        for (int cont = 1; cont <= n; cont++){
            System.out.printf("%d\n", cont);
        }
    }
}
