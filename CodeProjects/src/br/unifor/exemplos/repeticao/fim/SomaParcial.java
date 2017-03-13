package br.unifor.exemplos.repeticao.fim;

import java.util.Scanner;

/**
 * Exemplo 02: Algoritmo que mostra a soma parcial dos números fornecidos como entrada.
 * O algoritmo deve finalizar quando a soma ultrapassar 1000.
 */
public class SomaParcial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero, soma;

        soma = 0;

        do {
            System.out.print("Informe numero: ");
            numero = scanner.nextDouble();
            soma = soma + numero;
            System.out.printf("Soma parcial: %4.2f\n", soma);
        } while (soma <= 1000);

    }
}
