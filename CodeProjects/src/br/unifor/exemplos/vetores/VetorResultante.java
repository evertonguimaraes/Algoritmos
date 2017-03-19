package br.unifor.exemplos.vetores;

import java.util.Scanner;

/**
 * Exemplo 3: Ler dois vetores A e B com 20 elementos cada. Construir um vetor C, onde cada elemento de C é a
 * subtração do elemento correspondente de A com B. Apresentar o vetor C.

 */
public class VetorResultante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        double[] A = new double[tamanho];
        double[] B = new double[tamanho];
        double[] C = new double[tamanho];

        // Usa o for para percorrer o vetor A e inserir elementos.
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Informe A[%d]: ", i);
            A[i] = scanner.nextDouble();
        }

        // Usa o for para percorrer o vetor B e inserir elementos.
        for (int i = 0; i < B.length; i++) {
            System.out.printf("Informe B[%d]: ", i);
            B[i] = scanner.nextDouble();
        }

        // Usa o for para percorrer o vetor B e inserir elementos.
        // O elemento de C[posicao] = A[posicao] - B[posicao]
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
            System.out.printf("C[%d]: %4.2f\n", i, C[i]);
        }



    }
}
