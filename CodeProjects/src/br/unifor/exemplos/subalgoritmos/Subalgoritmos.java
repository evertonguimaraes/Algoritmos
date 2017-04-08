package br.unifor.exemplos.subalgoritmos;

import com.sun.tracing.dtrace.FunctionAttributes;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 05/04/17.
 */
public class Subalgoritmos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 =  entrada.nextInt();

        // As variaveis n1 e n2 são chamadas de
        // parametros reais que foram passados para a função.
        somaP(n1, n2);

        // Chamando a função
        int soma = somaF(n1, n2);
        String somaS = String.valueOf(soma);
        imprime(somaS);
    }

    // procedimento
    // assinatura do subalgoritmo
    // as variáveis n1 e n2 são chamadas de parametros formais.
    public static void somaP(int n1, int n2){
        int resultado = n1 + n2;
        System.out.printf("A soma de %d + %d: %d %n", n1, n2, resultado);
    }

    // função
    public static int somaF(int n1, int n2){
        return (n1 + n2);
    }

    // procedimento
    static void imprime(String texto){
        System.out.printf("Resultado da soma: %s %n", texto);
    }
}
