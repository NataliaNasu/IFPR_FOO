/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr;

/**
 *
 * @author Silvia
 */
public class Produto {
    //CLASSE é um TEMPLATE para se criar os OBJETOS. 
    // 1 - Atributos (variáveis da classe)
    int id;
    String descricao; 
    int estoque;
    double preco;
    
    // 2 - Métodos construtores. (método = função, 
    //construtores = inicializam os atributos da classe)
    public Produto() {
    }
    
    public Produto(int id, String descricao, int estoque, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;
    }
    
    // 3 - Métodos get/set > altera os atributos individualmente. 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
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
    
    //método toString: imprime o conteúdo de um objeto.

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", estoque=" + estoque + ", preco=" + preco + '}';
    }
    
}
