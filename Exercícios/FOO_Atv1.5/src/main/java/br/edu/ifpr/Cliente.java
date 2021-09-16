package br.edu.ifpr;

public class Cliente {
    int codigo;
    String nome;
    String dataNascimento;
    double renda;
    int idade;

    int calcularIdade(int anoAtual, int anoNasc) {
        idade = anoAtual - anoNasc;
        return idade;
    }

    void imprimir() {
        System.out.println("------- CADASTRO -------");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nasc: " + dataNascimento);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Renda: R$" + renda);
        System.out.println("------------------------\n");
    }
}
