package br.unifor.exemplos.selecao.multiplaescolha;

import java.util.Scanner;

/**
 * Exemplo 02: Algoritmo que recebe como entrada o valor de uma fatura e a forma de pagamento, e calcula e mostra o
 * total a pagar de acordo com o seguinte:
 * 'A' – à vista, 10% de desconto;
 * 'B' – em 2 vezes, 5% de desconto;
 * 'C' – em 3 vezes, 5% de desconto;
 * 'D' – em 6 vezes, valor nominal;
 * Outro forma, valor nominal.
 */

public class Fatura {

    public static void main(String[] args) {

        // Declaração de Variáveis
        char formaPagamento;
        double valorDevido, valorFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe valorDevido: ");
        valorDevido = scanner.nextDouble();

        System.out.print("Informe formaPagamento pgto: ");
        formaPagamento = scanner.next().charAt(0);

        // Implementação adaptada para deixar a solução mais clara.
        switch (formaPagamento) {
            case 'A':
                System.out.println("Pagamento a VISTA.");
                valorFinal = 0.90 * valorDevido;
                System.out.printf("O valor pago em uma unica parcela de: %.2f", valorFinal);
                break;

            case 'B':
                System.out.println("Pagamento em 2 Parcelas");
                valorFinal = 0.95 * valorDevido;
                System.out.printf("O valor de cada parcela sera de: %.2f", valorFinal/2);
                break;

            case 'C':
                System.out.println("Pagamento em 3 Parcelas");
                valorFinal = 0.95 * valorDevido;
                System.out.printf("O valor de cada parcela sera de: %.2f", valorFinal/3);
                break;

            case 'D':
                System.out.println("Pagamento em 6 Parcelas");
                valorFinal = valorDevido;
                System.out.printf("O valor de cada parcela sera de: %.2f", valorFinal/6);

            default:
                valorFinal = valorDevido;
                System.out.printf("O valor pago sera em uma unica parcela de: %.2f", valorFinal);
        }
        System.out.printf("Total: %4.2f", valorFinal);
    }
}
