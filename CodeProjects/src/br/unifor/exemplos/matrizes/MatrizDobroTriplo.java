package br.unifor.exemplos.matrizes;

/**
 * Fazer um algoritmo que leia uma matriz A (3 x 3) de números reais.
 * Construa uma matriz B onde cada elemento seja o dobro do elemento correspondente
 * em A, com exceção dos valores da diagonal principal, que deverão ser o triplo.
 */
public class MatrizDobroTriplo {

    public static void main(String[] args) {

        double A [][] = MatrizOps.loadMatrizDouble();

        System.out.println("Matriz A");
        MatrizOps.printMatriz(A);
        System.out.printf("%n");

        int linhas = A.length;
        int colunas = A[0].length;

        double B [][] = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if(i == j){
                    B[i][j] = A[i][j] * 3;
                }else{
                    B[i][j] = A[i][j] * 2;
                }
            }
        }

        System.out.println("Matriz B");
        MatrizOps.printMatriz(B);
        System.out.printf("%n");
    }
}
