package br.unifor.exemplos.selecao.simples;

import java.util.Scanner;

/**
 * Exemplo 02: Algoritmo que recebe como entrada o salário base e o  total vendido por um funcionário, calcula e
 * mostra o seu salário total, sabendo-se que o funcionário recebe gratificação de R$ 300 caso o total vendido
 * seja superior a R$ 2000
 */

public class Gratificacao {

    public static void main(String[] args) {

        double base, vendas, total;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salario base: ");
        base = scanner.nextDouble();

        System.out.print("Qual o total de vendas? ");
        vendas = scanner.nextDouble();

        total = base;

        if (vendas > 2000) {
            total = total + 300;
        }

        System.out.printf("Salario: %6.2f", total);

    }
}
