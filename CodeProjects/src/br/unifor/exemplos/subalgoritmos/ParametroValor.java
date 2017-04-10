package br.unifor.exemplos.subalgoritmos;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 10/04/17.
 */
public class ParametroValor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero.");
        int n2 = sc.nextInt();

        troca(n1, n2);

        System.out.printf("Após troca... %n");
        System.out.printf("N1: %d %n", n1);
        System.out.printf("N2: %d %n", n2);
    }

    public static void troca (int m1, int m2){
        int aux;
        aux = m1;
        m1 = m2;
        m2 = aux;

        System.out.printf("M1: %d %n", m1);
        System.out.printf("M2: %d %n", m2);
    }

}
