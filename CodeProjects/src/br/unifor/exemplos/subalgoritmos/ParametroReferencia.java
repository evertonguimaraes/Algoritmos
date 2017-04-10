package br.unifor.exemplos.subalgoritmos;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 10/04/17.
 */
public class ParametroReferencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v [] = {15, 12};

        troca(v);

        System.out.printf("Após troca... %n");
        System.out.printf("N1: %d %n", v[0]);
        System.out.printf("N2: %d %n", v[1]);
    }

    public static void troca (int vetor []){
        int aux;
        aux = vetor[1];
        vetor[1] = vetor[0];
        vetor[0] = aux;

        System.out.printf("M1: %d %n", vetor[0]);
        System.out.printf("M2: %d %n", vetor[1]);
    }
}
