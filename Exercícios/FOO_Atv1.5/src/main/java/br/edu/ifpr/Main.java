package br.edu.ifpr;

public class Main {
    public static void main(String[] args) {
        Cliente novaCliente1 = new Cliente();
        novaCliente1.codigo = 1234;
        novaCliente1.nome = "Fulana de tal";
        novaCliente1.dataNascimento = "20/09/1960";
        novaCliente1.renda = 5000;
        novaCliente1.calcularIdade(2021, 1960);
        novaCliente1.imprimir();

        Cliente novoCliente2 = new Cliente();
        novoCliente2.codigo = 2345;
        novoCliente2.nome = "Fulano";
        novoCliente2.dataNascimento = "01/02/1990";
        novoCliente2.renda = 2000;
        novoCliente2.calcularIdade(2021, 1990);
        novoCliente2.imprimir();

        Cliente novaCliente3 = new Cliente();
        novaCliente3.codigo = 3456;
        novaCliente3.nome = "Fulana2";
        novaCliente3.dataNascimento = "15/04/2000";
        novaCliente3.renda = 1000;
        novaCliente3.calcularIdade(2021, 2000);
        novaCliente3.imprimir();
    }
}
