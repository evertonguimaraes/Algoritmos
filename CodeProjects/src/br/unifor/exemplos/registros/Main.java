package br.unifor.exemplos.registros;

/*
* Crie um programa para cadastramento de clientes, de acordo com o que se pede:
* Criar um sub-algoritmo de cadastramento do cliente
* Criar um sub-algoritmo de visualização do cliente
* Criar um sub-algoritmo que permite verificar qual o cliente com maior salário.
* Criar um sub-algoritmo para visualizar os dados de todos os clientes (preferencialmente use tabulação)
* Criar um menu que permite ao usuário possa escolher uma das ações realizadas por esses sub-algoritmos
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    // O Scanner está como variavel global.
    static Scanner input = new Scanner(System.in);
    static Cliente [] clientes;

    public static void main(String[] args) {

        int contador = 0;
        boolean repete = true;
        clientes = new Cliente[10];

        do{

            System.out.println("--------------------------");
            System.out.println("--------- MENU------------");
            System.out.println("--------------------------");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Visualizar cliente");

            int opcao = input.nextInt();

            switch (opcao){

                case 0:
                    System.out.println("Terminando....");
                    repete = false;
                    break;
                case 1:
                    if (contador < 10){
                        clientes[contador] = cadastrarCliente();
                        contador++;
                    }else{
                        System.out.println("Vetor FULL. Nao foi possivel cadastro");
                    }
                    break;
                case 2:
                    System.out.println("Informe o id do cliente.");
                    int id = input.nextInt();
                    Cliente c = visualizarCliente(id);
                    if (c != null){
                        System.out.println(c.toString());
                    }else{
                        System.out.println("Cliente nao existe.");
                    }
                    break;

                case 3:
                    int indiceMaiorSalario = maiorSalario();
                    if (indiceMaiorSalario >= 0){
                        Cliente cliente = clientes[indiceMaiorSalario];
                        System.out.println(cliente.toString());
                    }else{
                        System.out.println("Nao existe maior salario.");
                    }
                default:
                    System.out.println("Opcao Invalida. Tente novamente....");
            }

        }while(repete);
    }

    public static Cliente cadastrarCliente(){

        System.out.println("Informe os dados do cliente. ");
        Cliente cliente = new Cliente();

        // TODO Nao esta recuperando o nome;
        System.out.print("Nome: ");
        cliente.nome = input.nextLine();
        input.nextLine();

        System.out.print("Endereco: ");
        cliente.endereco = input.nextLine();

        System.out.print("Salario: ");
        cliente.salario = input.nextDouble();

        System.out.print("Idade: ");
        cliente.idade = input.nextInt();

        System.out.println("Digite o ID do cliente");
        cliente.id = input.nextInt();

        System.out.print("Brasileiro?: ");
        cliente.isBrasileiro = input.nextBoolean();

        return cliente;

    }

    public static Cliente visualizarCliente(int id){

        Cliente cliente = null;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null){
                cliente = clientes[i];
            }
        }
        return cliente;
    }

    public static int maiorSalario(){
        int indiceMaiorSalario = -1; // Comeca em -1 caso não tenha maior salario
        double maiorSalario = 0;

        Cliente cliente = null;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null){
                cliente = clientes[i];
                if (cliente.salario > maiorSalario) {
                    maiorSalario = cliente.salario;
                    indiceMaiorSalario = i;
                }
            }
        }
        return indiceMaiorSalario;
    }
}
