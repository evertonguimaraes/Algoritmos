package br.unifor.exemplos.vetores;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 22/03/17.
 */
public class OperacoesVetores {

    public static void main(String[] args) {

        // LEITURA
        Scanner input = new Scanner(System.in);

        // VETORES
        // CRIACAO
        // TODO Criar vetor predefinido
        int idades [] = {18, 25, 37, 32, 15};

        // PARA SABER O TAMANHO DO VETOR
        double salarios [] = new double[4];

        // TODO Popular / Inserir dados no vetor
        for (int cont = 0; cont < salarios.length; cont++){
            System.out.printf("Digite o elemento na posicao [%d]", cont);
            salarios[cont] = input.nextDouble();
        }

        // ARITMETICAS
        double notasP1 [] = new double[3];
        notasP1[0] = 2.5;
        notasP1[1] = 6.7;
        notasP1[2] = 8.5;

        double notasP2 [] = {8.4, 5.7, 9.2};

        // Os valores dos indices desse vetor é a media das notas
        // dos vetores notasP1 e notasP2;
        double mediaNotas [] = new double[3];

        /*
         * Construa um algoritmo que leia um vetorA de 20 posicoes;
         * Construa um vetor B. sendo que o elemento de B é o somatorio dos elementos de A,
         * do inicio até a posicao deste elemento.
         * B[1] = A[1];
         * B[2] = A[1] + A[2]
         * B[3] = A[1] + A[2] + A[3]
         */

        for (int cont = 0; cont < mediaNotas.length; cont++){
            double media = (notasP1[cont] + notasP2[cont]) / 2;
            mediaNotas[cont] = media;
        }
        // CONSTRUCAO VETORES

        int vetor1[] = new int[5];
        int vetor2[] = new int[5];

        System.out.println("Digite os elementos de A. ");
        for (int i = 0; i < vetor1.length; i++){
            System.out.printf("a[%d]: ", i);
            vetor1[i] = input.nextInt();
        }

        System.out.println("Digite os elementos de B. ");
        for (int i = 0; i < vetor2.length; i++){
            System.out.printf("b[%d]: ", i);
            vetor2[i] = input.nextInt();
        }

        // SOLUCAO 01;
        int soma = 0;
        for (int cont = 0; cont < vetor1.length; cont++ ){
            soma = soma + vetor1[cont];
            vetor2[cont] = soma;
        }

        // SOLUCAO 02
        for (int cont = vetor1.length - 1; cont >= 0; cont-- ){
            int tamanho = cont;
            for (int j =  cont; j >= 0; j++){
                soma = soma + vetor1[tamanho];
                tamanho--;
            }
        }

        // IMPRESSAO
        System.out.println("Ordem Direta");
        for (int cont = 0; cont < vetor2.length; cont++){
            System.out.printf("b[%d]: %d . \n", cont, vetor2[cont]);
        }


        /*
            Ler dois vetores A e B com 15 elementos cada.
            Construir um vetor C, sendo este a junção dos dois outros vetores.
            Desta forma, C deverá ter o dobro de elementos, ou seja, 30.
            Apresentar o vetor C.
         */

        System.out.println("Informe o tamanho dos vetores. ");
        int tamanho = input.nextInt();
        int a[] = new int[tamanho];
        int b[] = new int[tamanho];

        int c[] =  new int[a.length+b.length];

        // TODO De acordo com a lógica discutida em sala de aula.


        System.out.println("Ordem Inversa.");
        for (int cont = salarios.length - 1; cont >= 0; cont--){
            System.out.printf("salarios[%d]: %.2f . \n", cont, salarios[cont]);
        }

        int vetorA [] = {2, 9, 5, 7, 7, 9, 8, 6, 9, 4};
        int tam = vetorA.length;
        int elementosRepetidos = 0;

        for (int i = 0; i < tam; i++){
            int qtd = 0;
            for (int j = i + 1; i <= tam - 2; j++){
                if (vetorA[i] == vetorA[j]){
                    qtd++;
                }
            }

            if (qtd >= 1){
                System.out.printf("O elemento a[%d]: %d se repete no vetor ", i, vetorA[i]);
                elementosRepetidos++;
            }

            // TODO O que fazer com os elementos que já foram contabilizados.

        }

        // TODO O vetor b deve ser construido somente com os elementos de a que não se repetem.
        int d [] = new int[vetorA.length - elementosRepetidos];
        for (int j = 0; j < d.length; j++){
            // TODO
        }
    }
}
