package br.unifor.praticas.praticaVII;

/**
 * Construa um algoritmo que dada uma matriz predefinida A3x2, imprima os elementos da
 * matriz de forma tabular, conforme mostrado em sala.
 */
public class Questao01 {

    public static void main(String[] args) {

        double matriz [][] = {
                {2.5, 5.6},
                {2.7, 8.7},
                {7.6, 4.3}};

        // Imprimir matriz predefinida
        printMatriz(matriz);
    }

    public static void printMatriz(double m [][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%.2f \t", m[i][j]);
            }
            System.out.printf("%n");
        }
    }

}
