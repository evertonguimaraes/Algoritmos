package br.unifor.exemplos.matrizes;

/**
 * Faça um programa que declare uma matriz 2x3 pré-definida.
 * Em seguida, imprima a matriz.
 */
public class MatrizDefinida {

    public static void main(String[] args) {

        int matriz [][] = { {4, 5, 7},
                            {8, 2, 4},
                            {3, 5, 2} };

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        System.out.printf("Linhas: %d %n", linhas);
        System.out.printf("Colunas: %d %n", colunas);

        System.out.println("Matriz A");
        for (int i = 0; i < linhas; i++) { // percorre as linhas
            for (int j = 0; j < colunas; j++) { // percorre as colunas
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
