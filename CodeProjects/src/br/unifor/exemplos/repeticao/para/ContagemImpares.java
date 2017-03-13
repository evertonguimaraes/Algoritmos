package br.unifor.exemplos.repeticao.para;

/**
 * Exemplo 02: Algoritmo que mostra os inteiros ímpares de 1 a 15.
 */
public class ContagemImpares {

    public static void main(String[] args) {

        // TODO
        // Incrementa de 1 em 1, verificando se o valor do contador é impar.
        for (int cont = 0; cont <= 15; cont++){
            if(cont % 2 == 1){
                System.out.printf("%d\n", cont);
            }
        }

        //TODO
        // Incrementa de 2 em 2, iniciando de um numero impar.
        // Menor numero de repetições.
        for (int cont = 1; cont <= 15; cont = cont + 2){

            System.out.printf("%d\n", cont);
        }
    }
}
