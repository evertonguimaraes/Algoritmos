package br.unifor.desafio;

import java.util.Scanner;

/*
Um cinema possui capacidade para 100 lugares e está sempre com ocupação total. Certo dia, cada espectador respondeu a
um questionário, no qual constava.
 - Sua idade;
 - Sua opinião em relação ao filme, segundo a tabela;

Crie um algoritmo que, lendo esses dados, calcule e imprima:
 - A quantidade de resposta ótimo;
 - A diferença do percentual das pessoas que responderam ruim;
 - A média de idade das pessoas que responderam ruim;
 - A percentagem de respostas péssimo e a maior idade que utilizou essa opção;
 - A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim.
*/
public class DesafioCinema {

    public static void main(String[] args) {

        int quantidadeLugares =  100;
        int respostasA = 0, respostaB = 0, respostaC = 0, respostaD = 0, respostaE = 0;
        int maiorA, maiorB, maiorC, maiorD, maiorE;

        for (int i = 0; i < 100; i++){
            System.out.printf("Questionario: %d", (i+1));
            Scanner input = new Scanner(System.in);

            System.out.println("Informe sua idade. ");
            int idade = input.nextInt();

            boolean codigoIncorreto = true;
            String opcao = null;
            char codigo;
            do {
                System.out.println("Informe sua opção. ");
                System.out.println("A - Otimo");
                System.out.println("B - Bom");
                System.out.println("C - Regular");
                System.out.println("D - Ruim");
                System.out.println("E - Pessimo");

                opcao = input.nextLine();
                codigo = opcao.toLowerCase().charAt(0);

                if (codigo != 'a' || codigo != 'b' || codigo != 'c' || codigo != 'd' || codigo != 'e') {
                    codigoIncorreto = false;
                }
            }while (codigoIncorreto);

            switch (codigo){
                case 'a':
                    respostasA++;
                    break;
                case 'b': break;
                case 'c': break;
                case 'd': break;
                case 'e': break;
            }

        }


    }
}
