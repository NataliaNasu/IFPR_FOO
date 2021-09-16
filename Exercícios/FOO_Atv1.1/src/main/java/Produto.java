public class Produto {
    int codigo;
    String descricao;
    int estoque;
    double preco;

    void imprimir() {
        System.out.println("\n------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Estoque: " + estoque);
        System.out.println("Preço: R$" + preco);
        System.out.println("------------------------");
    }
}