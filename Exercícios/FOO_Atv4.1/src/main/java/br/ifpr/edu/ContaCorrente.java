package br.ifpr.edu;

public class ContaCorrente {
    private String nome;
    private String agencia;
    private String conta;
    private double saldo;

    public ContaCorrente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public void imprimir() {
        System.out.println("\n---------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo : R$" + saldo);
        System.out.println("---------------------------");
    }
}
