package br.unifor.exemplos.sequencial;

import java.util.Scanner;

/**
 * Algoritmo para calcular a média de dois números.
 */

public class MediaSequencial {

    public static void main(String[] args) {

        double numero1, numero2, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        numero1 = scanner.nextDouble();

        System.out.println("Informe o segundo numero");
        numero2 = scanner.nextDouble();

        media = (numero1 + numero2) / 2;

        System.out.printf("Media: %4.2f \n", media);
    }
}
