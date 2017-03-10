package br.unifor.exemplos.selecao.composta;

import java.util.Scanner;

/**
 * Exemplos 05: Dado um inteiro como entrada, faça um algoritmo que:
 * 1) Caso este seja menor do que 30, adiciona 10 ao número e multiplica por 5; ou,
 * 2) do contrário, subtrai 10 e multiplica por 3;
 * 3) Adiciona 1 caso o resultado obtido seja ímpar ou multiplica por 3 caso o resultado obtido seja par;
 * 4) E, finalmente, mostra o resultado final.
 */
public class CalculoNumero {

    public static void main(String[] args) {

        int numero;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe um numero inteiro qualquer: ");
        numero = scanner.nextInt();

        // Etapa 1
        if (numero < 30) {
            numero = numero + 10;
            numero = numero * 5;
        } else {
            numero = numero - 10;
            numero = numero * 3;
        }

        // Etapa 2
        if (numero % 2 == 1) {
            numero = numero + 1;
        } else {
            numero = numero * 3;
        }

        System.out.printf("Resultado: %d \n", numero);
    }
}
