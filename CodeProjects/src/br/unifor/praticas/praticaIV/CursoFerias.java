package br.unifor.praticas.praticaIV;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 10/03/17.
 */
public class CursoFerias {

    public static void main(String[] args) {

        //LEITURA DE DADOS
        Scanner scanner = new Scanner(System.in);


        System.out.println("-------------------------");
        System.out.println("         OPCOES          ");
        System.out.println("-------------------------");
        System.out.println("1 - Verifiar Informaçoes");
        System.out.println("2 - Realizar Matricula");
        System.out.println("3 - Sair");
        System.out.println("Digite uma opcao: ");

        int opcao = scanner.nextInt();


        switch (opcao){


            case 1: //TODO Dados do Professor / Curso
                System.out.println("NOME: Everton Guimaraes");
                System.out.println("TITULACAO: Doutor em Ciencias - Informatica");
                System.out.println("DESCRICAO CURSO: Desenvolvimento de Aplicativos Moveis");
                System.out.println("CARGA HORARIA: 40 Horas");
                break;


            case 2: //TODO LER DADOS DA MATRICULA / REALIZAR MATRICULA
                String nome, email;
                String turno = null; // INICIALIZA COMO SUL PORQUE NAO REALIZA A LEITURA
                int matricula, idade, experienciaJava, experienciaAndroid;
                double IRA;
                boolean elegivel = false;

                System.out.println("Informe sua matricula: ");
                matricula = scanner.nextInt();

                System.out.println("Informe sua idade: ");
                idade = scanner.nextInt();

                // TODO PARA SABER A EXPERIENCIA EM JAVA DO ALUNO
                // TODO NIVEL EM JAVA
                boolean opcaoInvalidaJava;
                do{
                    opcaoInvalidaJava = false;
                    System.out.println("Qual sua experiencia em JAVA? ");
                    System.out.println("0 - Nenhum.");
                    System.out.println("1 - Basico.");
                    System.out.println("2 - Intermediario.");
                    System.out.println("3 - Avancado");

                    experienciaJava = scanner.nextInt();

                    if(experienciaJava < 0 || experienciaJava > 3){
                        System.out.println("Opcao INCORRETA. Tente novamente");
                        opcaoInvalidaJava = true;
                    }

                }while(opcaoInvalidaJava);

                // TODO NIVEL EM ANDROID
                boolean opcaoInvalidaAndroid;
                do{
                    opcaoInvalidaAndroid = false;
                    System.out.println("Qual sua experiencia em ANDROID? ");
                    System.out.println("0 - Nenhum.");
                    System.out.println("1 - Basico.");
                    System.out.println("2 - Intermediario.");

                    experienciaAndroid = scanner.nextInt();

                    if(experienciaAndroid < 0 || experienciaAndroid > 2){
                        System.out.println("Opcao INCORRETA. Tente novamente");
                        opcaoInvalidaJava = true;
                    }

                }while(opcaoInvalidaAndroid);

                // TODO VERIFICAR ELEGIBILIDADE DO CANDIDATO.
                // TODO INICIO

                /*
                    a) Turno da manhã. O aluno deve ter no pelo menos conhecimento Básico em Java
                    (Não é exigido conhecimento prévio em desenvolvimento para Android).

                    b) Turno da tarde. O aluno deve ter pelo conhecimento Intermediário ou Avançado em Java;
                    O aluno deve ter no mínimo conhecimento Básico em desenvolvimento para Android.

                    c) Turno da noite. Conhecimento Avançado em Java;
                    O aluno deve ter no mínimo conhecimento Intermediário em desenvolvimento pra Android;

                    d) Caso o aluno não tenha nenhum conhecimento em Java, o sistema deve informar que ele não
                    é elegível para realizar esse curso.
                */




                // TODO FIM

                System.out.println("Informe seu nome: ");
                nome = scanner.next();
                scanner.nextLine(); // Consumir o LIXO do ENTER.

                System.out.println("Informe seu email: ");
                email = scanner.nextLine();

                if (elegivel){
                    System.out.println("Parabens, voce foi matriculado no curso");
                    System.out.printf("Matricula: %d", matricula);
                    System.out.printf("Turno: %s", turno);
                }else{
                    System.out.println("Voce NAO PODE PARTICIPAR DESTE CURSO.");
                }
                break;

            case 3: //TODO SAI DO SISTEMA
                System.out.println("Saindo do Programa....");
                break;

        }

    }
}
