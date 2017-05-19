package br.unifor.praticas.praticaVII;

import java.util.Scanner;

/**
 * Construa um algoritmo que leia uma matriz A5x4, com números reais. Crie um sub-algoritmo que
 * receba uma matriz de entrada e imprima todos os seus elementos.
 *
 * Você deve chamar esse sub-algoritmo no programa principal, passando a matriz A5x4 criada
 * anteriormente como parâmetro, para que seus elementos possam ser impressos.
 */
public class Questao02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TODO Deixando a solução mais generica
        System.out.println("Informe o numero de linhas.");
        int linhas = input.nextInt();

        System.out.println("Informe o numero de colunas");
        int colunas = input.nextInt();

        double matriz [][] = new double[linhas][colunas];

        // Matriz com dados de entrada.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("matriz[%d][%d]: ", i, j);
                matriz[i][j] = input.nextDouble();
                System.out.printf("%n");
            }
        }

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
