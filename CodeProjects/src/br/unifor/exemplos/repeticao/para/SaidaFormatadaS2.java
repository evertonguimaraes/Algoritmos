package br.unifor.exemplos.repeticao.para;

import java.util.Scanner;

/**
 * Exemplo 07: Algoritmo que recebe como entrada um inteiro positivo n e gera saída conforme exemplo.
 */
public class SaidaFormatadaS2 {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe n: ");
        n = scanner.nextInt();

        for (int lin = 1; lin <= n; lin++){
            for (int col = 1; col <= lin; col++){
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
