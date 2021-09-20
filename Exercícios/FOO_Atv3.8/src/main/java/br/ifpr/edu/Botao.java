package br.ifpr.edu;

public class Botao {
    private int estado;
    private String cor;
    private int x;
    private int y;

    public void desenhe(String cor) {
        this.cor = cor;
        System.out.println("   ~ " + cor + " ~ ");
    }

    public void aperte(int estado) {
        this.estado = estado;
        if (estado == 1) {
            System.out.println("    ~ Click ~");
        } else {
            System.out.println("Não apertou!");
        }
    }

    public void mova(int estado) {
        if (estado == 1)
            System.out.println("  ~ Movimento ~");
        else
            System.out.println("Sem movimento");
    }

    public void imprimir() {
        System.out.println("------------------");
        System.out.println("Estado: " + estado);
        System.out.println("Cor: " + cor);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}