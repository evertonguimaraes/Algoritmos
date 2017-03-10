package br.unifor.exemplos.selecao.multiplaescolha;

import java.util.Scanner;

/**
 * Exemplo 01:  Algoritmo que recebe como entrada um inteiro que representa o dia da semana (1: domingo; 2: segunda; ...; 7:
 sábado) e mostra o dia da semana por extenso (domingo, segunda, ..., sábado).
 */

public class DiaSemana {

    public static void main(String[] args) {

        int dia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero correspondente ao dia da semana dia (1 a 7)");
        dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia inexistente");

        }
    }
}