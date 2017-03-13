package br.unifor.exemplos.repeticao.para;

import java.util.Scanner;

/**
 * Exemplo 04: Algoritmo que mostra a soma de n valores fornecidos como entrada.
 */
public class SomaN {

    public static void main(String[] args) {

        int n;
        double numero, soma;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe qtde numeros: ");
        n = scanner.nextInt();

        soma = 0;

        for (int cont = 1; cont <= n; cont++){
            System.out.print("Informe numero: "); numero = scanner.nextDouble();
            soma = soma + numero;
        }

        System.out.printf("%4.2f\n", soma);
    }
}
