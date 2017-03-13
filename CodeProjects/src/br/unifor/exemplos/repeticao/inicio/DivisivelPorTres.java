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

        // TODO Validacao dos valores de A e B pois deve respeitar a relação (A < B)
        if (a > b){
            int aux = b;
            b = 1;
            a = aux;
        }

        qtde = 0;
        cont = a;

        while (cont <= b) {
            if (cont % 3 == 0) {
                qtde = qtde + 1;
                System.out.printf("O numero %d eh divisor de 3. \n", cont);
            }
            cont = cont + 1;
        }

        System.out.printf("Quantidade: %d", qtde);
    }
}
