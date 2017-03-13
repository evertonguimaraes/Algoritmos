package br.unifor.exemplos.repeticao.inicio;

import java.util.Scanner;

/**
 * Exemplo 03: Algoritmo que calcula e mostra a média de n números informados pelo usuário.
 */
public class CalcularMedia {

    public static void main(String[] args) {

        int n, cont;
        double numero, soma, media;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro qualquer: ");
        n = scanner.nextInt();

        soma = 0;
        cont = 1;

        while (cont <= n) {
            System.out.printf("Informe %d numero  :", cont);
            numero = scanner.nextDouble();
            soma = soma + numero;
            cont = cont + 1;
        }

        media = soma / n;

        System.out.printf("Media: %4.2f", media);
    }
}

