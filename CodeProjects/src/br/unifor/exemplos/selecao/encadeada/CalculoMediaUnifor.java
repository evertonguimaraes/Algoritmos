package br.unifor.exemplos.selecao.encadeada;

import java.util.Scanner;

/**
 * Exemplo02: Em uma universidade, o rendimento acadêmico é baseado em duas notas parciais (NP1 e NP2).
 * Qualquer aluno com média ME = (NP1 + NP2) / 2 >= 8 está aprovado por média. Há, ainda, uma terceira nota, a da prova
 * final (PF), que só é aplicada se o aluno tiver média ME < 8. Neste caso, para ser aprovado, o aluno deve obter média
 * final MF = (ME + NF) / 2 >= 5. Faça um algoritmo que lê as notas de um aluno, e mostra sua situação “Aprovado por
 * media”, “Aprovado por media final”, ou “Reprovado”.
 */
public class CalculoMediaUnifor {

    public static void main(String[] args) {

        // Declaração de Variaveis
        int frequenciaMensal;
        double np1, np2, notaFinal, mediaNPs, mediaFinal;

        // Criação do Scanner para leitura de dados
        Scanner scanner = new Scanner (System.in);

        // Leitura de dados (np1, np2 e frequencia)
        System.out.print("Informe a nota da NP1: ");
        np1 = scanner.nextDouble();

        System.out.print("Informa a nota da NP2: ");
        np2 = scanner.nextDouble();

        // A questao foi modificada para considerar também o critério de frequencia.
        System.out.println("Informa a frequencia na disciplina (0 a 100)");
        frequenciaMensal = scanner.nextInt();

        // Condição 1
        if(frequenciaMensal >= 75){
            // Calculo da média das NPs
            mediaNPs = (np1 + np2) / 2;

            // Condição 2
            if (mediaNPs >= 8) {
                System.out.println("Aprovado por media.");

            } else {
                System.out.print("Informe a nota da Prova Final: ");
                notaFinal = scanner.nextDouble();

                // Calculo da media final
                mediaFinal = (mediaNPs + notaFinal) / 2;

                // Condição 3
                if (mediaFinal >= 5) {
                    System.out.println("Aprovado por media final.");
                } else {
                    System.out.println("Reprovado.");
                }
            }
        }else{
            System.out.println("Reprovado por media. ");
        }




    }
}
