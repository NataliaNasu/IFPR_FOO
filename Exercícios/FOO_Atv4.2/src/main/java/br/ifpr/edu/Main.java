package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
        Produto caneta01 = new Produto();
        caneta01.setCodigo(1111);
        caneta01.setDescricao("Azul");
        caneta01.setEstoque(1500);
        caneta01.setPreco(1.5);
        caneta01.imprimir();

        Produto caneta02 = new Produto();
        caneta02.setCodigo(1112);
        caneta02.setDescricao("Vermelho");
        caneta02.setEstoque(500);
        caneta02.setPreco(1.5);
        caneta02.imprimir();

        Produto caneta03 = new Produto();
        caneta03.setCodigo(1113);
        caneta03.setDescricao("Preto");
        caneta03.setEstoque(200);
        caneta03.setPreco(1.5);
        caneta03.imprimir();  
    }
}