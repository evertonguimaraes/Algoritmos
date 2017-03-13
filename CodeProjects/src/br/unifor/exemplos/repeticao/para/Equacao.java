package br.unifor.exemplos.repeticao.para;

/**
 * Exemplo 06: Faça um algoritmo que mostra todos os pares ordenados que satisfazem a
 * equação 2x - y = 0, tal que x e y sejam inteiros entre 0 e 1000 e, além disso, x é ímpar.
 */
public class Equacao {

    public static void main(String[] args) {

        // TODO Solução 01
        for (int x = 0; x <= 1000; x++){
            for (int y = 0; y <= 1000; y++){
                if (2*x - y == 0 && x % 2 == 1){
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }

        // TODO Solução 02
        for (int x = 1; x <= 1000; x = x + 2){
            for (int y = 0; y <= 1000; y++){
                if (2*x - y == 0){
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }
}
