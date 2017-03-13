package br.unifor.exemplos.repeticao.para;

import java.util.Scanner;

/**
 * Exemplo 07: Algoritmo que recebe como entrada um inteiro positivo n e gera saída conforme exemplo.
 */
public class SaidaFormatadaS1 {

    public static void main(String[] args) {

        int n;
        String texto;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe n: ");
        n = scanner.nextInt();

        texto = "1";

        for (int linha = 1; linha <= n; linha++){
            System.out.println(texto);
            texto = texto + " " + linha;
        }
    }
}
