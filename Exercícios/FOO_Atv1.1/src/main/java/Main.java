class Main {
    public static void main (String[] args) {
        Produto caneta = new Produto();
        caneta.codigo = 99901;
        caneta.descricao = "Bic Azul";
        caneta.estoque = 200;
        caneta.preco = 1.5;
        caneta.imprimir();

        Produto caneta2 = new Produto();
        caneta2.codigo = 99902;
        caneta2.descricao = "Bic Preta";
        caneta2.estoque = 80;
        caneta2.preco = 1.5;
        caneta2.imprimir();

        Produto caneta3 = new Produto();
        caneta3.codigo = 99903;
        caneta3.descricao = "Bic Vermelha";
        caneta3.estoque = 150;
        caneta3.preco = 1.5;
        caneta3.imprimir();
    }
}
