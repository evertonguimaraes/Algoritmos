package br.unifor.exemplos.vetores;

import java.util.Scanner;

/**
 * Construa um algoritmo que crie um vetor de inteiros com N posicoes, e verifique quais são os numeros pares.
 * Além disso, o algoritmo deve exibir qual o maior numero entre os pares.
 */
public class MaiorNumeroPar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Criação de um vetor de inteiros.

        int numeros[];
        int maiorPar = 0;

        System.out.println("Quantos elementos você ira digitar?");
        int n = input.nextInt();
        numeros = new int[n];

        // Percorre o vetor e insere elementos
        for (int posicao = 0; posicao < n; posicao++){
            System.out.printf("Informe o valor do elemento na posicao  %d . \n", posicao);
            numeros[posicao] = input.nextInt();
        }

        // Percorrer os elementos e imprimir os valores PARES
        for (int posicao = 0; posicao < n; posicao++){

            if(numeros[posicao] % 2 == 0){
                System.out.printf("numeros[%d]: %d \n", posicao, numeros[posicao]);

                if (numeros[posicao] > maiorPar){
                    maiorPar = numeros[posicao];
                }
            }
        }
        System.out.printf("O maior numero par: %d .\n", maiorPar);
    }
}
