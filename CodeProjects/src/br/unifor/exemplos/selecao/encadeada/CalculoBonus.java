package br.unifor.exemplos.selecao.encadeada;

import java.util.Scanner;

/**
 * Exemplo 01:  Uma empresa concedeu um bônus de 20% do valor do salário aos funcionários com tempo de serviço igual
 * ou superior a 5 anos, de 15% aos funcionários com tempo de serviço inferior a 5 anos mas igual ou superior a 3 anos,
 * e de 10% aos demais. Faça um algoritmo que recebe como entrada seu salário e seu tempo de serviço, calcula e mostra
 * o valor do seu bônus.
 */
public class CalculoBonus {

    public static void main(String[] args) {

        int tempo;
        double salario, bonus;

        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe o salario: ");
        salario = scanner.nextDouble();

        System.out.print("Qual seu tempo de servico: ");
        tempo = scanner.nextInt();

        if (tempo >= 5) {
            bonus = 0.20 * salario;
        } else {
            if (tempo >= 3) {
                bonus = 0.15 * salario;
            } else {
                bonus = 0.10 * salario;
            }
        }

        System.out.printf("Bonus: % 10.2f\n", bonus);
    }
}
