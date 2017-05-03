package br.unifor.exemplos.matrizes;

/**
 * Fazer um algoritmo que leia uma matriz A com 3 linhas e 2 colunas.
 * Construa uma matriz B onde cada elemento deverá ser o fatorial do
 * elemento correspondente da matriz A.
 */
public class MatrizFatorial {

    public static void main(String[] args) {

        int A[][] = MatrizOps.loadMatrizInt();
        int linhas = A.length;
        int colunas = A[0].length;

        long B[][] = new long[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                B[i][j] = MatrizOps.fatorial(A[i][j]);
            }
        }

        MatrizOps.printMatriz(B);

    }
}
