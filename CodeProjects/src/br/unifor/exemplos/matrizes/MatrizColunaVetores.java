package br.unifor.exemplos.matrizes;

/**
 * Faça um programa que leia dois vetores A e B, ambos com 7 elementos reais.
 * Construa uma matriz C de duas dimensões onde a primeira coluna é formada pelos
 * elementos do vetor A e a segunda coluna é formada pelos elementos do vetor B.
 */
public class MatrizColunaVetores {

    public static void main(String[] args) {

        double A [] = {1.4, 4.5, 2.4, 3.1, 7.5, 2.3, 6.5};
        double B [] = {5.3, 2.4, 4.2, 7.4, 4.3, 7.2, 4.3};

        int linhas = A.length;
        int colunas = 2;

        double C [][] = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            C[i][0] = A[i];
            C[i][1] = B[i];
        }

        MatrizOps.printMatriz(C);

    }
}
