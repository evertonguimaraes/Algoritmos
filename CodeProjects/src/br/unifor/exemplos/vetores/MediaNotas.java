package br.unifor.exemplos.vetores;

import java.util.Scanner;

/**
 * Faça um algoritmo para calcular a média das notas de 10 alunos e determinar a quantidade de alunos que
 * possuem nota superior à média calculada.
 */
public class MediaNotas {

    public static void main(String[] args) {

        int tamanho = 4;
        double notas [] = new double[tamanho];

        Scanner input = new Scanner(System.in);

        System.out.println("Vamos comecar. ");

        // Para percorrer usa o for e informamos a nota dos alunos para cada posicao;
        for(int posicao = 0; posicao < tamanho; posicao++){
            System.out.printf("Informe a nota do aluno %d . \n", posicao+1);
            notas[posicao] = input.nextDouble();
        }

        //notas = (5.4, 6.5, 9.2, 8.7)
        double somaTotal = 0, media;
        for (int posicao = 0; posicao < tamanho; posicao++){
            somaTotal = somaTotal + notas[posicao];
        }

        media = somaTotal / tamanho;
        System.out.printf("A media da turma foi de: %.2f . \n", media);


        int notasMaiorMedia = 0;
        for (int posicao = 0; posicao < tamanho; posicao++){
            if(notas[posicao] > media){
                notasMaiorMedia++;
            }
        }

        System.out.printf("Notas maior que a media: %d . \n", notasMaiorMedia);

    }
}
