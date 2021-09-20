package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
        Cliente novo1 = new Cliente();
        novo1.setCodigo(1001);
        novo1.setNome("Fulano");
        novo1.setDataNascimento("01/02/2000");
        novo1.setRenda(1500.0);
        novo1.imprimir();

        Cliente novo2 = new Cliente();
        novo2.setCodigo(1002);
        novo2.setNome("Fulana");
        novo2.setDataNascimento("02/05/2000");
        novo2.setRenda(2500.0);
        novo2.imprimir();

        Cliente novo3 = new Cliente();
        novo3.setCodigo(1003);
        novo3.setNome("Ciclano");
        novo3.setDataNascimento("01/02/2002");
        novo3.setRenda(3500.0);
        novo3.imprimir();
    }
}