package br.unifor.exemplos.repeticao.fim;

import java.util.Scanner;

/**
 * Exemplo 03: Algoritmo que, dados dois inteiros a e b como entrada, calcula e mostra o máximo
 * divisor comum de a e b. O algoritmo deve garantir que a e b são maiores que 0.
 */
public class CalculaMDC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, cont, mdc;

        do {

            System.out.print("Informe o numero A: ");
            a = scanner.nextInt();

            System.out.print("Informe o numero Bb: ");
            b = scanner.nextInt();

        } while (a <= 0 || b <= 0);

        mdc = 1;
        cont = 1;

        while (cont <= a && cont <= b) {
            if (a % cont == 0 && b % cont == 0) {
                mdc = cont;
            }
            cont++;
        }

        System.out.printf("MDC: %d\n", mdc);
    }
}
