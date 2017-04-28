package br.unifor.exemplos.matrizes;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Faça um programa que leia uma matriz 4x3 de inteiros. Em seguida, imprima os valores de cada um desses elementos.
 */
public class MatrizEntrada {

    public static void main(String[] args) {

        int linhas, colunas;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o numero de linhas da matriz.");
        linhas = input.nextInt();

        System.out.println("Informe o numero de colunas da matriz");
        colunas = input.nextInt();

        int matriz [][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("matriz[%d][%d]: %n", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        printMatrix(matriz);
        printDiagonalPrincipal(matriz);

    }

    static void printMatrix(int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%d \t", matriz[i][j]);
            }
            System.out.printf("%n");
        }
    }

    static void printDiagonalPrincipal(int matriz [][]){

        if (matriz.length == matriz[0].length){
            System.out.println("Elementos da diagonal principal");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (i == j){
                        System.out.printf("%d \t", matriz[i][j]);
                    }
                }
            }
        }else{
            System.out.println("Nao foi possivel calcular a diagonal");
            System.out.println("A matriz informada nao eh quadrada");
        }

    }
}
