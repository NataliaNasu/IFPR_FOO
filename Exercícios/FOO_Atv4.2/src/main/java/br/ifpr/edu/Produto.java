package br.ifpr.edu;

public class Produto {
    private int codigo;
    private String descricao;
    private int estoque;
    private double preco;

    public Produto() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String setDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("\n---------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Estoque: " + estoque);
        System.out.println("Preço: R$" + preco);
        System.out.println("---------------------");
    }
}
