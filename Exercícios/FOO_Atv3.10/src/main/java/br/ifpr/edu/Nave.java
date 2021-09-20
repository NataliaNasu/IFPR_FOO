package br.ifpr.edu;

public class Nave {
    private int estado;
    private int velocidade;
    private int direcao;

    public void situacaoNave(int estado, int velocidade, int direcao) {
        this.estado = estado;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }

    public void imprimir() {
        System.out.println("-----------------");
        System.out.println("Estado: " + estado);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Direção: " + direcao);
    }
}
