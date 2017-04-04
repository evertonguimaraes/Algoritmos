package br.unifor.exemplos.manipulacao;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 31/03/17.
 */
public class ManipulacaoString {

    public static void main(String[] args) {

        // TODO Aula 29/03
        // Concatenação
        String a = "Ciencia";
        String b = "da";
        String c = "Computação";

        String d = a + " " + b + " " + c;
        //String d = a + b + c;
        System.out.printf("String resultante: %s \n", d);

        // TODO Comparação usando "=="

        Scanner sc = new Scanner(System.in);
        String m1 = null; // "Brilha";
        String m2 = null; // "Brilha";

        System.out.println("Informe o valor de m1");
        m1 = sc.nextLine();

        System.out.println("Informe o valor de m2");
        m2 = sc.nextLine();

        System.out.printf("Comparacao (==): %b \n", (m1 == m2 ));
        System.out.printf("Comparacao (EQUALS): %b \n", m1.equals(m2));

        // Tamanho de uma String
        System.out.printf("Tamanho da String M1: %d \n", m1.length());
        System.out.printf("Tamanho da String M2: %d \n", m2.length());

        // TODO Substring

        //"Ciencia da Computacao"
        String sub1 = d.substring(8); // Informa somente o indice inicio;
        String sub2 = d.substring(8,10); // Informa o indice de inicio e fim;

        String eng = "Engenharia" + " " +sub1;
        System.out.printf("Sub 1: %s \n", eng);

        // TODO Split
        String cpf = "043.983.234-24";
        String cpnj = "88.907.732.0001-23";
        String partes [] = cpnj.split("-");
        String s1 = partes[0];
        String s2 = partes[1];

        System.out.printf("Split 1: %s \n", s1);
        System.out.printf("Split 2: %s \n", s2);

        // TODO Inicializar uma String com um vetor de caracteres
        char [] frase = {'E','u',' ', 'v', 'o', 'u', ' ', 'a',
                'p','r','e','n','d','e','r',' ', 'l','o','g','i','c','a'};
        String caracteres = new String(frase);
        System.out.printf("Caracteres: %s \n", caracteres);

        // TODO Concatenacao usando concat
        String complemento = " de Programacao";
        System.out.printf("(F1) Frase Completa: %s \n", caracteres.concat(complemento));
        System.out.printf("(F2) Frase Completa: %s%s \n", caracteres, complemento );

        // TODO equals vs "==" (return boolean)
        // TODO equalsIgnoreCase
        String p1 = "Programacao";
        String p2 = "pRoGraMACao";

        String ps1 = p1.toLowerCase();
        String ps2 = p2.toLowerCase();

        System.out.printf("P1.equals(p2): %b\n", p1.equals(p2));
        System.out.printf("PS1.equals(pS2): %b \n", ps1.equals(ps2));
        System.out.printf("P1.equals(P2): %b \n", ps1.equalsIgnoreCase(ps2));

        // compareTo
        // retorna 0 (zero) se ambas forem iguais;
        // retorna um número negativo se o String que chama o método for menor que o String passado como parâmetro;
        // retorna um número positivo se o String que chama o método for maior que o String que for passado como parâmetro.

        p1.compareTo(p2);

        // TODO toLowerCase
        System.out.printf("toLowerCase: %s \n", p1.toLowerCase());

        // TODO toUpperCase
        System.out.printf("toUpperCase: %s \n", p1.toUpperCase());

        // TODO replace
        // eng -> Engenharia da Computacao;
        eng = eng.replace('E', 'e');
        eng = eng.replace('C', 'c');

        System.out.printf("Replace: %s \n", eng);

        eng = eng.replace('a', 'A');
        eng = eng.replace('o', 'O');
        System.out.printf("Replace: %s \n", eng);

        // TODO Conversão Tipos

        int num1 = 10;
        String valor1 = String.valueOf(num1);
        String f ="Voce é nota ";
        System.out.printf("Frase Completa: %s \n", f.concat(valor1));

        double num2 = 9.3;
        String valor2 = String.valueOf(num2);

        int x = Integer.parseInt("100");
        int num1toString = Integer.parseInt(valor1);
        double num2toString = Double.parseDouble(valor2);

        long num3 = 1937747474;
        String valor3 = String.valueOf(num3);
        long num3toString = Long.parseLong(valor3);

        System.out.printf("num1toString: %d \n ", num1toString);
        System.out.printf("num2toString: %.2f \n", num2toString);
        System.out.printf("num3toString: %d \n", num3toString);


        // TODO Aula 03/04

        String curso = "Desenvolvimento de aplicativos com Google Android";
        // TODO indexOf
        System.out.printf("Indice do elemento 'a': %d %n", curso.indexOf('a'));
        System.out.printf("Indice do elemento 'a': %d %n", curso.indexOf('G'));
        System.out.printf("Indice do elemento 'a': %d %n", curso.indexOf('o'));

        System.out.printf("Indice do elemento a partir de um indice FIXO: 'a': %d %n", curso.indexOf('o', 15));

        String google = "Google";
        System.out.printf("Indice do elemento 'aplicativos': %d %n", curso.indexOf(google));

        // TODO lastIndexOf
        System.out.printf("Ultimo Indice do elemento 'o': %d %n", google.lastIndexOf('o'));

        // TODO StringBuilder
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(10); // capacidade
        StringBuilder builder3 = new StringBuilder("Java");

        System.out.printf("builder1 = %s %n", builder1);
        System.out.printf("builder2 = %s %n", builder2);
        System.out.printf("builder3 = %s %n", builder3);


        // ensureCapacity
        builder3.ensureCapacity(80); // garante que o StringBuilder tenha pelo menos a capacidade especificada.
        System.out.printf("builder3 (capacity)= %s %n", builder3.capacity());

        // capacity
        System.out.printf("builder3 (capacity)= %s %n", builder3.capacity());

        // lenght
        System.out.printf("builder3 (lenght)= %s %n", builder3.length());


        // setLenght
        builder3.setLength(4); // aumenta ou diminui o comprimento de um StringBuffer
        System.out.printf("builder3 (lenght)= %s %n", builder3.length());

        // charAt
        char caractere = builder3.charAt(0);

        // setCharAt
        builder3.setCharAt(0, 'j');

        // reverse
        builder3.reverse();
        System.out.printf("reversa = %s %n", builder3.toString());

        // append
        StringBuilder builder4 = new StringBuilder("Linguagem de ");
        StringBuilder builder5 = new StringBuilder("Programacao");
        builder4.append(builder5);
        System.out.printf("builder4 = %s %n", builder4.toString());

    }
}
