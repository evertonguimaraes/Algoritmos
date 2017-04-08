package br.unifor.provas.np1;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 10/03/17.
 */
public class OrdenaNumeros {

    public static void main(String[] args) {

        // TODO Declaração de Variaveis
        double num1, num2, num3;

        double menor = 0, meio = 0, maior = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("   ############ Vamos começar ############");

        System.out.println("Informe o primeiro numero. ");
        num1 = entrada.nextDouble();

        System.out.println("Informe o segundo numero. ");
        num2 = entrada.nextDouble();

        System.out.println("Informe o terceiro numero. ");
        num3 = entrada.nextDouble();

        // TODO Descobrindo o numero menor, maior, e do meio.
        if(num1 < num2 && num1 < num3){
            menor = num1;
            if(num2 < num3){
                meio = num2;
                maior = num3;
            }
        }else{
            if(num2 < num1 && num2 < num3){
                menor = num2;
                if(num1 < num3){
                    meio = num1;
                    maior = num3;
                }
            }else{
                maior = num1;
                meio = num2;
                menor = num3;
            }
        }

        System.out.println("Ok, agora digite uma opcao para ordenar os numeros. ");
        System.out.printf("Opcao 1: Crescente. \n");
        System.out.printf("Opcao 2: Decrescente. \n");
        System.out.printf("Opcao 3: Maior no meio. \n");
        int opcao = entrada.nextInt();

        if(opcao == 1){
            System.out.printf("Opcao 1: Crescente: %.2f, %.2f, %.2f . \n", menor, meio, maior);
        }else{
            if(opcao == 2){
                System.out.printf("Opcao 2: Decrescente: %.2f, %.2f, %.2f . \n", maior, meio, menor);
            }else{
                if(opcao == 3){
                    System.out.printf("Opcao 3: Maior no meio: %.2f, %.2f, %.2f . \n", menor, maior, meio);
                }
            }
        }
    }
}
