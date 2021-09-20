package br.ifpr.edu;

public class Equipamento {
    String nome;
    String fabricante;
    int peso;
    int preco;

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Preço: $" + preco);
    }
}