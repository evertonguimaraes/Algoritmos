package br.unifor.exemplos.repeticao.para;

import java.util.Scanner;

/**
 * Escreva um algoritmo que, dados como entrada o número de itens diferentes comercializados e, para
 * cada item, o preço de custo, o preço de venda e a quantidade vendida, calcula e mostra:
 * a) o custo total das mercadorias vendidas;
 * b) o faturamento total com a comercialização das mercadorias;
 * c) o lucro total auferido no período; d) e o maior lucro unitário.
 */
public class VendaMercadorias {

    public static void main(String[] args) {

        int n,quantidadeVenda;
        double precoCusto, precoVenda;
        double totalCusto = 0, totalVenda = 0, totalLucro = 0, maior = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe qtde itens: ");
        n =  scanner.nextInt();

        for (int cont = 1; cont <= n; cont++){

            System.out.print("Informe o preco de custo: ");
            precoCusto = scanner.nextDouble();

            System.out.print("Informe o preco de venda: ");
            precoVenda = scanner.nextDouble();

            System.out.print("Informe a quantidade vendida: ");
            quantidadeVenda = scanner.nextInt();

            totalCusto = totalCusto + quantidadeVenda * precoCusto;
            totalVenda = totalVenda + quantidadeVenda * precoVenda;

            if (precoVenda - precoCusto > maior){
                maior = precoVenda - precoCusto;
            }
        }

        totalLucro = totalVenda - totalCusto;
        System.out.printf("Custo total: %4.2f\n", totalCusto);
        System.out.printf("Faturamento total: %4.2f\n", totalVenda);
        System.out.printf("Lucro total: %4.2f\n", totalLucro);
        System.out.printf("Maior lucro unit.: %4.2f\n", maior);
    }
}
