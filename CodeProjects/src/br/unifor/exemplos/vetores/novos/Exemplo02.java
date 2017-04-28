package br.unifor.exemplos.vetores.novos;

// Faça um algoritmo para ler 10 elementos em um vetor A.
// Construir um vetor B de mesma dimensão com os elementos
// do vetor A multiplicados por 3. Apresentar o vetor B.

public class Exemplo02 {

    public static void main(String[] args) {
                       //     n1 n2 num
        int vetor [] = {1, 1, 2, 3, 5};

        int num1 = 1;
        int num2 = 1;

        int numero = 0;

        System.out.print("(");
        for (int i = 1; i < 6 ; i++) {
            num1 = num2;
            num2 = numero;
            numero = num1 + num2;
            System.out.printf("Numero %d", numero);
        }
        System.out.println(")");

        System.out.print("(");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ",vetor[i]);
        }
        System.out.println(")");

    }
    
}
