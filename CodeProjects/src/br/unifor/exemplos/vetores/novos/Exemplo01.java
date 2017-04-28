package br.unifor.exemplos.vetores.novos;


// * Created by evertonguimaraes on 18/04/17.
// * Faça um algoritmo para calcular a média das notas de N
// * alunos e determinar a quantidade de alunos que possuem nota
// * superior à média calculada.

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Professor, informe quantos alunos voce tem.");
        int quantidade = entrada.nextInt();

        double soma = 0;
        double [] notas = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a nota do aluno %d %n", i);
            notas[i] = entrada.nextDouble();
            soma = soma + notas[i];
        }

        double media = soma / quantidade;
        int alunosMaiorMedia = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media){
             alunosMaiorMedia++;
                System.out.printf("O aluno %d obteve nota acima da media. %n", i);
            }
        }

        System.out.printf("Nesta turma, %d alunos tiveram nota maior" +
                "que a media (%.2f)", alunosMaiorMedia, media);
    }
}
