package br.ifpr.edu;

public class Cliente {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private double renda;
    private double anoNasc;
    private double anoAtual;
    private double idade;

    public Cliente() {

    }

    public Cliente(int codigo, String nome, String dataNascimento, double renda) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.renda = renda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double calculoIdade(double anoAtual, double anoNasc) {
        idade = anoAtual - anoNasc;
        return idade;
    }

    public void imprimir() {
        System.out.println("\n---------------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento = " + dataNascimento);
        System.out.println("Renda: R$" + renda);
        System.out.println("---------------------------------");
    }
}