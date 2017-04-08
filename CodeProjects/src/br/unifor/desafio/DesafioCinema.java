package br.unifor.desafio;

import java.util.Random;
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


        int quantidadeLugares =  20; //100;

        // TODO substituir por vetor de int.
        int maiorA = 0, maiorB = 0, maiorC = 0, maiorD = 0, maiorE = 0;
        int respostasA = 0, respostasB = 0, respostasC = 0, respostasD = 0, respostasE = 0;
        int somaIdadeA = 0, somaIdadeB = 0, somaIdadeC = 0, somaIdadeD = 0, somaIdadeE = 0;

        for (int i = 0; i < quantidadeLugares; i++){

            System.out.printf("Questionario: %d %n", (i+1));
            Scanner input = new Scanner(System.in);

            // TODO Utilizando o randomico para evitar digitação.
            Random random = new Random();
            int idade = random.nextInt(80);

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
                System.out.println("-------------------");

                opcao = input.nextLine();
                codigo = opcao.toLowerCase().charAt(0);

                if (codigo != 'a' || codigo != 'b' || codigo != 'c' || codigo != 'd' || codigo != 'e') {
                    codigoIncorreto = false;
                }


                switch (codigo){
                    case 'a':
                        respostasA++;
                        somaIdadeA = somaIdadeA + idade;
                        if (idade > maiorA) maiorA = idade;
                        break;
                    case 'b':
                        respostasB++;
                        somaIdadeB = somaIdadeB + idade;
                        if (idade > maiorB) maiorB = idade;
                        break;
                    case 'c':
                        respostasC++;
                        somaIdadeC = somaIdadeC + idade;
                        if (idade > maiorC) maiorC = idade;
                        break;
                    case 'd':
                        respostasD++;
                        somaIdadeD = somaIdadeD + idade;
                        if (idade > maiorD) maiorD = idade;
                        break;
                    case 'e':
                        respostasE++;
                        somaIdadeE = somaIdadeE + idade;
                        if (idade > maiorE) maiorE = idade;
                        break;
                    default:
                        System.out.println("Opcao Invalida. Tente novamente.");
                        break;
                }
            }while (codigoIncorreto);

        } // FIM FOR

        // A quantidade de resposta ótimo.
        System.out.printf("Respostas Otimo: %d %n", respostasA);

        // FIXME Está ZERANDO os numeros;
        // A diferença do percentual das pessoas que responderam ruim.
        System.out.printf("Diferença Percentual Ruim: %f %n", (float) (respostasD / quantidadeLugares));

        // A média de idade das pessoas que responderam ruim.
        int mediaIdade =  somaIdadeD / respostasD;
        System.out.printf("Media idade pessoas que responderam ruim: %d %n", mediaIdade);

        // FIXME Está ZERANDO os numeros;
        // A percentagem de respostas péssimo e a maior idade que utilizou essa opção.
        System.out.printf("Percentual resposta Pessimo: %f Maior Idade: %d %n", (float) (respostasD / quantidadeLugares), maiorE);

        // A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim.

        int valor = 0;
        if(maiorA > maiorD ){
            valor = maiorA - maiorD;
        }else{
            valor = maiorD - maiorA;
        }

        System.out.printf("Diferença Maior Idade OTIMO vs RUIM: %d", valor);



    }
}