package br.unifor.exemplos.repeticao.inicio;

/**
 * Exemplo 01: Algoritmo que mostra os inteiros de 1 a 10.
 */
public class Contagem {

    public static void main(String[] args) {

        int cont = 1;
        while (cont <= 10) {
            System.out.printf("%d\n", cont);
            cont = cont + 1;
        }
    }
}
