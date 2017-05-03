package br.unifor.exemplos.matrizes;

/**
 * Faça um programa que leia duas matrizes A e B, cada uma com duas dimensões,
 * 5 linhas e 3 colunas. Construa uma matriz C formada pela soma dos elementos
 * da matriz A com os elementos da matriz B.
 */
public class MatrizResultante {

    public static void main(String[] args) {

        // Predefinida
        int A [][] = { {3, 4, 5}, {1, 6, 7}, {8, 5, 3}, {4, 5, 2}, {9, 4, 7}};
        int B [][] = { {1, 3, 7}, {2, 3, 3}, {6, 9, 7}, {3, 0, 1}, {0, 2, 8}};

        // Dados de entrada
        int linhas = A.length;
        int colunas = A[0].length;

        int C [][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        MatrizOps.printMatriz(C);
    }
}
