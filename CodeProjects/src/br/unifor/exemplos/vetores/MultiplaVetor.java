package br.unifor.exemplos.vetores;

/**
 * Faça um algoritmo para ler 10 elementos em um vetor A.
 * Construir um vetor B de mesma dimensão com os elementos do vetor A multiplicados por 3.
 * Apresentar o vetor B.

 */
public class MultiplaVetor {

    public static void main(String[] args) {

        // Criar um vetor predefinido de 10 elementos;
        int A [] = {5,6,9,3,0,8,2,6,7,11};

        int B [] = new int[A.length];

        for (int posicao = 0; posicao < B.length; posicao++){
            B[posicao] = A[posicao] * 3;
        }

        for (int posicao = 0; posicao < B.length; posicao++){
            System.out.printf("B[%d]: %d \n", posicao, B[posicao]);
        }

    }
}
