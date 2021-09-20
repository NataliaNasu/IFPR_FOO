package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
        ContaCorrente poupanca = new ContaCorrente();
        poupanca.setNome("Fulano");
        poupanca.setAgencia("0001");
        poupanca.setConta("1234 5678 1234 5678");
        poupanca.setSaldo(500.0);
        poupanca.imprimir();

        ContaCorrente poupanca2 = new ContaCorrente();
        poupanca2.setNome("Fulana");
        poupanca2.setAgencia("1000");
        poupanca2.setConta("1234 5678 9999 9999");
        poupanca2.setSaldo(1500.0);
        poupanca2.imprimir();

        ContaCorrente poupanca3 = new ContaCorrente();
        poupanca3.setNome("Ciclano");
        poupanca3.setAgencia("0100");
        poupanca3.setConta("1111 1111 1234 5678");
        poupanca3.setSaldo(2500.0);
        poupanca3.imprimir();
    }
}
