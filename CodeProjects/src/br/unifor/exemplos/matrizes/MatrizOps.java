package br.unifor.exemplos.matrizes;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 03/05/17.
 */
public class MatrizOps {

    public static void main(String[] args) {

        //int matriz [][] = new int [5][5];

        int matriz [][] = {
                {4,5,6,6},
                {3,3,2,1},
                {9,2,0,4},
                {7,5,8,8},
        };

        System.out.println("Matriz");


        System.out.printf("%n");
        System.out.printf("Elementos da diagonal principal %n");
        printDiagonalPrincipal(matriz);
    }

    public static double[][] loadMatrizDouble(){
        Scanner input = new Scanner(System.in);

        System.out.println("Determine a ordem da MATRIZ (m, n)");
        System.out.println("Informe o numero de linhas. ");
        int linhas = input.nextInt();

        System.out.println("Informe o numero de colunas. ");
        int colunas = input.nextInt();

        double matriz [][] =  new double[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("matriz[%d][%d]: ", i, j);
                matriz[i][j] = input.nextDouble();
            }
        }

        input.close();

        return matriz;
    }

    public static int[][] loadMatrizInt(){
        Scanner input = new Scanner(System.in);

        System.out.println("Determine a ordem da MATRIZ (m, n)");
        System.out.println("Informe o numero de linhas. ");
        int linhas = input.nextInt();

        System.out.println("Informe o numero de colunas. ");
        int colunas = input.nextInt();

        int matriz [][] =  new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("matriz[%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        input.close();

        return matriz;
    }

    public static void printMatriz(int matriz [][]){
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[0].length; j++) { // percorre as colunas
                System.out.printf("%d \t", matriz[i][j]);
            }
            System.out.printf("%n");
        }
    }

    public static void printMatriz(long matriz [][]){
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[0].length; j++) { // percorre as colunas
                System.out.printf("%d \t \t", matriz[i][j]);
            }
            System.out.printf("%n");
        }
    }

    public static void printMatriz(double matriz [][]){
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[0].length; j++) { // percorre as colunas
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.printf("%n");
        }
    }

    public static void printDiagonalPrincipal(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[0].length; j++) { // percorre as colunas
                if (i == j){
                    System.out.printf("%d ", matriz[i][j]);
                }
            }
        }
    }

    public static long fatorial (int n){
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }

}
