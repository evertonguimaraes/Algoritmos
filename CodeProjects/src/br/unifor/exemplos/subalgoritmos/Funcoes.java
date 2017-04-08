package br.unifor.exemplos.subalgoritmos;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 05/04/17.
 */
public class Funcoes {

    static Scanner entrada = new Scanner(System.in);

    // Construa um algoritmo que receba numeros entre 10 e 100
    // e verifique se eles são pares. Caso sim, imprima a mensagem
    // informando ao usuario
    public static void main(String[] args) {

        // TODO Colocar num do/while até que a opcao digitada seja 0.

        System.out.println("Digite uma opcao. ");
        System.out.println("0 - Sair");
        System.out.println("1 - verificar se um numero é par");
        System.out.println("2 - soma de numeros de 1 a N");

        int opcao = entrada.nextInt();
        do {
            switch (opcao){

                case 0:
                    System.out.printf("Terminando....");
                    break;

                case 1:
                    case1();
                    break;

                case 2:
                    int soma = soma1N();
                    parImpar(soma);
                    break;

                case 3:
                    System.out.printf("Informa a base.");
                    double base = entrada.nextDouble();
                    System.out.println("Informe o expoente");
                    double expoente = entrada.nextDouble();
                    Subalgoritmos.imprime(String.valueOf(potencia(base, expoente)));

                default:
                    System.out.printf("Opcao Invalida. Tente outra vez...");

            }
        }while (opcao != 0);


    }

    // funcao potencia

    static double potencia (double base, double expoente){
        double potencia = 1;
        for (int i = 1; i < expoente; i++){
            potencia = potencia * base;
        }

        return potencia;
    }

    // funcao
    static int soma1N() {
        int numero, soma = 0;
        System.out.println("Digite um numero qualquer. ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++){
            soma = soma + i;
        }

        return soma;
    }

    // procedimento
    static void case1(){
        int numero = 0;
        boolean opcaoErrada = false;
        do{
            opcaoErrada = false;
            System.out.printf("Digite um numero de 10 a 100");
            numero = entrada.nextInt();
            if(numero < 10 || numero > 100){
                opcaoErrada = true;
            }
        }while(opcaoErrada);

        parImpar(numero);
    }

    // procedimento
    static void parImpar(int numero){
        if (numero % 2 == 0){
            System.out.printf("O numero %d eh PAR %n", numero);
        }else{
            System.out.printf("O numero %d eh IMPAR %n", numero);
        }
    }

}
