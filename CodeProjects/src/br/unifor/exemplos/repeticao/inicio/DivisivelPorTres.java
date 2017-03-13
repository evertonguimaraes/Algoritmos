package br.unifor.exemplos.repeticao.inicio;

import java.util.Scanner;

/**
 * Exemplo 04: Algoritmo que, dado um valor inicial a e um valor final b (a < b, inteiros),
 * calcula a quantidade de números divisíveis por 3 neste intervalo.
 */
public class DivisivelPorTres {

    public static void main(String[] args) {

        int a, b, cont, qtde;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um inteiro A: ");
        a = scanner.nextInt();

        System.out.print("Informe um inteiro B: ");
        b = scanner.nextInt();

        qtde = 0;
        cont = a;

        while (cont <= b) {
            if (cont % 3 == 0) {
                qtde = qtde + 1;
            }
            cont = cont + 1;
        }

        System.out.printf("Quantidade: %d", qtde);
    }
}
