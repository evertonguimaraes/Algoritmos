package br.unifor.exemplos.manipulacao;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 03/04/17.
 */
public class JogoForca {

    public static void main(String[] args) {

        //TODO Here is your code.
        Scanner input = new Scanner(System.in);

        boolean acertouPalavra = false;
        boolean continuarJogo = true;

        String palavras [] = {"professor",
                "cadeira", "algoritmo",
                "bode", "aracaju", "caixa",
                "darth vader"};

        String dicas [] = {"Ensino aos jovens e velhos",
                        "Utilizada para sentar, mas tambem pode deitar",
                        "Uma sequencia de passos para resolver um determinado problema",
                        "Gosta muito de uma cabra.",
                        "Serve para guardar e carregar coisas",
                        "O lado negro da força"};

        System.out.println("-------------------------");
        System.out.println("      JOGO DA FORCA      ");
        System.out.println("-------------------------");

        do{
            System.out.println("0 - Sair");
            System.out.println("1 - Jogar");
            System.out.println("2 - Ver regras");

            int opcao = input.nextInt();

            switch (opcao){

                case 0 :
                    continuarJogo = false;
                    break;
                case 1 :

                    // TODO Your code is here.
                    // TODO Implement the game
                    break;
                case 2 :

                    // TODO Your code is here.
                    // TODO Implement the rules.
                    break;
                default:
                    System.out.println("Opcao Invalida.");
                    break;
            }


        }while(continuarJogo);

        System.out.println("Terminando o jogo...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
