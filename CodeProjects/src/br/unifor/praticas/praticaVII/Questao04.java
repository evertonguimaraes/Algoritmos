package br.unifor.praticas.praticaVII;

import java.util.Scanner;

/**
 * Construa um algoritmo que crie e leia duas matrizes A e B de elementos inteiros.
 * O seu algoritmo deve ler também o número de linhas e colunas que cada matriz deverá conter.
 * Com base nessas duas matrizes, verifique se é possível realizar a multiplicação das mesmas.
 * Caso seja possível, crie uma matriz R resultando a multiplicação das matrizes A e B.
 */
public class Questao04 {

    public static void main(String[] args) {

        System.out.println("Matriz A");
        int a [][] = loadMatriz();

        System.out.println("Matriz B");
        int b [][] = loadMatriz();
    }

    public static int [][] loadMatriz(){

        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantidade de linhas");
        int linhas = input.nextInt();

        System.out.println("Informe quantidade de colunas");
        int colunas = input.nextInt();

        int matriz [][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("m[%d][%d]: ", i, j);
            }
        }
        return matriz;
    }

    public static void printMatriz(double m [][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%.2f \t", m[i][j]);
            }
            System.out.printf("%n");
        }
    }

    public static void multiplicarMatrizes(int [][] m1, int [][] m2){

        if(isPossibleMultiply(m1, m2)){
            // TODO Implementar algoritmo de multiplicacao.
            // TODO Considere uma matrizes de ordem até 3x3

        }else{
            System.out.println("Nao foi possivel multiplicar as matrizes.");
            System.out.println("Tente outra vez.");
        }
    }

    public static boolean isPossibleMultiply(int [][] m1, int [][] m2){
        if(m1[0].length == m2.length){
            return true;
        }
        return false;
    }


}
