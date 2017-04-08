package br.unifor.provas.np1;

/**
 * Created by evertonguimaraes on 31/03/17.
 */
public class TrocoSaque {


    public static void main(String[] args) {

        int num = 21931;

        if(num % 100 >= 0){
            int qtdNotas100 = num / 100;
            num = num % 100;
            System.out.printf("Notas de 100 : %d \n", qtdNotas100);
        }

        if(num % 50 >= 0){
            int qtdNotas50 = num / 50;
            num = num % 50;
            System.out.printf("Notas de 50 : %d \n", qtdNotas50);
        }

        if(num % 20 >= 0){
            int qtdNotas20 = num / 20;
            num = num % 20;
            System.out.printf("Notas de 20 : %d \n", qtdNotas20);
        }

        if(num % 10 >= 0){
            int qtdNotas10 = num / 10;
            num = num % 10;
            System.out.printf("Notas de 10 : %d \n", qtdNotas10);
        }

        if(num % 5 >= 0){
            int qtdNotas5 = num / 5;
            num = num % 5;
            System.out.printf("Notas de 5 : %d \n", qtdNotas5);
        }

        if(num % 2 >= 0){
            int qtdNotas2 = num / 2;
            num = num % 2;
            System.out.printf("Notas de 2 : %d \n", qtdNotas2);
        }

        int qtdMoedas1 = num;
        System.out.printf("Moedas de 1 : %d \n", qtdMoedas1);

    }
}
