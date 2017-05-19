package br.unifor.praticas.praticaVII;

import java.util.Scanner;

/**
 * Construa um algoritmo que leia a matricula e três notas (np1, np2, nf) de cada um dos 10 alunos
 * que fizeram prova final na disciplina de algoritmos. Crie um sub-algoritmo que receba essa matriz
 * como parâmetro e imprima a matricula e média final, caso o aluno tenha sido aprovado.
 *
 * A média final consiste na média aritmética das 3 notas. A nota mínima para aprovação será 7,0.
 */
public class Questao03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Informar a quantidade de alunos na sala.
        System.out.println("Informe quantos alunos tem na sala.");
        int qtd = input.nextInt();

        long matriculas [] = new long [qtd];

        double notas [][] = new double[qtd][3];

        for (int i = 0; i < notas.length ; i++) {

            System.out.printf("Informe a matricula do aluno %d. %n", i+1);
            matriculas[i] = input.nextLong();

            for (int j = 0; j < notas[0].length; j++) {
                System.out.printf("Informe a nota da NP %d ", j+1);
                notas[i][j] = input.nextDouble();
            }
        }

        // Chamando o subalgoritmo
        printAprovadosPorMedia(matriculas, notas);
    }

    public static void printAprovadosPorMedia(long m [], double n [][] ){

        double mediaAlunos [] = new double[m.length];

        // Calcula o vetor de media dos alunos.
        for (int i = 0; i < n.length ; i++) {
            double soma = 0;
            for (int j = 0; j < n[0].length; j++) {
                soma = soma + n[i][j];

            }
            double media =  soma / 3;
            mediaAlunos[i] = media;
        }

        // Verificar se o aluno passou
        // Imprimir matricula e media final.
        for (int i = 0; i < mediaAlunos.length; i++) {
            if (mediaAlunos[i] > 7.0){
                System.out.printf("Aluno aprovado. Matricula: %d, Media: %.2f %n", m[i], mediaAlunos[i]);
            }
        }
    }
}
