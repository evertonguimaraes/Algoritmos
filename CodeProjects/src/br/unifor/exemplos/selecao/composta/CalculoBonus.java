package br.unifor.exemplos.selecao.composta;

import java.util.Scanner;

/**
 * Exemplo 04: Uma empresa concedeu um bônus de 20% do valor do salário aos funcionários com tempo de serviço igual ou
 * superior a 5 anos e de 10% aos demais. Faça um algoritmo que recebe como entrada o seu salário e o tempo de serviço,
 * calcula e mostra o valor do seu bônus.
 */
public class CalculoBonus {

    public static void main(String[] args) {

        int tempo;
        double salario, bonus;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Qual seu salario: ");
        salario = scanner.nextDouble();

        System.out.print("Informe o tempo servico: ");
        tempo = scanner.nextInt();

        if (tempo >= 5) {
            bonus = 0.2 * salario;
        } else {
            bonus = 0.1 * salario;
        }

        System.out.printf("Bonus: % 4.2f\n", bonus);
    }
}
