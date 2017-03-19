package br.unifor.exemplos.vetores;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 17/03/17.
 */
public class VetorFatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho dos vetores. \n");
        int tamanho = scanner.nextInt();

        int[] A = new int[tamanho];
        int[] B = new int[tamanho];

        // Percorrer o vetor A e inserir elementos.
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Informe A[%d]: ", i);
            A[i] = scanner.nextInt();
        }

        // O for mais externo percorre os elementos do vetor B
        for (int i = 0; i < B.length; i++) {

            // Atribui o valor do fatorial do elemento A[posicao] para B[posicao]
            B[i] = fatorial(A[i]);

            // Imprime o valor do vetor A e o fatorial correspondente no elemento do vetor B.
            System.out.printf("A[%d]: %d \t B[%d]: %d \n", i, A[i], i, B[i]);
        }
    }

    // Subalgoritmo (NAO CAI NA PROVA DA NP1).
    public static int fatorial(int numero){
        int fatorial = 1;

        // Calcula o fatorial, iniciando de 1 ate o valor na posicao do vetor.
        for (int posicao = 1; posicao <= numero; posicao++) {
            fatorial = fatorial * posicao;
        }
        return fatorial;
    }
}
