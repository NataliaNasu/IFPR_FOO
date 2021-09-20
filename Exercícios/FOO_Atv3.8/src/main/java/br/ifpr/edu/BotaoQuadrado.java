package br.ifpr.edu;

public class BotaoQuadrado extends Botao {
    private int largura;
    private int altura;

    public void desenheQuadrado (int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        System.out.println("\n==================");
        System.out.println("~ Botao Quadrado ~ ");
    }

    public void imprimir() {
        System.out.println("\n >>> QUADRADO <<<");
        super.imprimir();
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
    }
}
