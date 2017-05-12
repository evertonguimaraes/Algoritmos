package br.unifor.exemplos.registros;

/**
 * Created by evertonguimaraes on 12/05/17.
 */
public class Cliente {

    public int id;
    public int idade;

    public boolean isBrasileiro;
    public double salario;

    public String nome;
    public String endereco;

    @Override
    public String toString() {
        return String.format("ID: %d, idade: %d, salario: %.2f",
                id, idade, salario);
    }
}
